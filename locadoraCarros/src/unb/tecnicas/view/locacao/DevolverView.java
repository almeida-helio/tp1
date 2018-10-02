package unb.tecnicas.view.locacao;

import unb.tecnicas.controller.impl.CarroControllerImpl;
import unb.tecnicas.controller.impl.OperacaoControllerImpl;
import unb.tecnicas.model.Operacao;
import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.util.DataUtil;
import unb.tecnicas.view.printters.Listar;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DevolverView  {

    private final OperacaoControllerImpl operacaoController;

    private final CarroControllerImpl carroController;

    public DevolverView(DatabaseSimulator databaseSimulator) {
        this.operacaoController = new OperacaoControllerImpl(databaseSimulator.getOperacaoList(),
                databaseSimulator.getCarroList());
        this.carroController = new CarroControllerImpl(databaseSimulator.getCarroList());
    }


    public void devolver() {
        List<Operacao> operacaoList = operacaoController.findAllPendente();
        if (operacaoList.size() == 0) {
            System.out.print("\nNao ha carros a serem devolvidos.");
            return;
        }
        Operacao operacao = this.selecionarOperacao(operacaoList);
        this.obterDataDevolucao(operacao);
        this.validaDataValor(operacao);
        this.confirmarPagamento(operacao);
        this.fechar(operacao);
    }

    private Operacao selecionarOperacao(List<Operacao> operacaoList) {
        Scanner s = new Scanner(System.in);
        Listar.listarOperacao(operacaoList);
        System.out.print("\n\nSelecione a operacao que deseja encerrar:");
        Operacao operacao = operacaoList.stream().filter( f -> f.getId() == s.nextInt())
                .collect(Collectors.toList()).get(0);
        return operacao;
    }

    private void obterDataDevolucao(Operacao operacao) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nInsira a data de devolucao(DD/MM/YYYY HH:MM): ");
        operacao.setDataDevolucao(DataUtil.stringToDate(s.nextLine()));
    }

    private void validaDataValor(Operacao operacao) {
        Long one = Duration.between(operacao.getDataLocacao(), operacao.getDataDevolucaoPrevista()).toDays();
        Long two = Duration.between(operacao.getDataLocacao(), operacao.getDataDevolucao()).toDays();
        if (one < two) {
            this.cadastrarMulta(operacao);
        }

    }

    private void cadastrarMulta(Operacao operacao) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nData de devolucao exced a prevista!");
        System.out.print("\nDeseja cadastrar uma multa percentual sobre o valor total?(S/N)");
        System.out.print("\nValor total = valorDiaria*diasAlugados");
        if (s.nextLine().equalsIgnoreCase("s")) {
            System.out.print("\nInsira o valor percentual do desconto(Ex.: 66.6):");
            operacao.setMulta(s.nextDouble()/100);
        }
    }

    private void confirmarPagamento(Operacao operacao) {
        Scanner s = new Scanner(System.in);
        double valorFinal = this.operacaoController.calculaValorFinal(operacao);
        do {
            System.out.print("\nO valor final e de U.M " + valorFinal);
            System.out.print("\nDeseja confirmar o pagamento e fechar a operacao? (S/N)");
            if(s.nextLine().equalsIgnoreCase("S")) {
                break;
            }
        }while (Boolean.TRUE);

    }



    private void fechar(Operacao operacao) {
        operacaoController.devolver(operacao);
    }

}
