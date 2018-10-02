package unb.tecnicas.view.locacao;

import unb.tecnicas.controller.impl.OperacaoControllerImpl;
import unb.tecnicas.model.Operacao;
import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.util.DataUtil;
import unb.tecnicas.view.printters.Listar;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DevolverView  {

    private final OperacaoControllerImpl operacaoController;

    public DevolverView(DatabaseSimulator databaseSimulator) {
        this.operacaoController = new OperacaoControllerImpl(databaseSimulator.getOperacaoList(),
                databaseSimulator.getCarroList());
    }


    public void devolver() {
        List<Operacao> operacaoList = operacaoController.findAllPendente();
        if (operacaoList.size() == 0) {
            System.out.print("\nNao ha carros a serem devolvidos.");
            return;
        }
        Operacao operacao = this.selecionarOperacao(operacaoList);
        this.obterDataDevolucao(operacao);
        this.fechar(operacao);
        this.fechar(operacao);
    }

    private Operacao selecionarOperacao(List<Operacao> operacaoList) {
        Scanner s = new Scanner(System.in);
        Listar.listarOperacao(operacaoList);
        System.out.print("\nSelecione o carro que deseja devolver");
        Operacao operacao = operacaoList.stream().filter( f -> f.getId() == s.nextInt())
                .collect(Collectors.toList()).get(0);
        return operacao;
    }

    private void obterDataDevolucao(Operacao operacao) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nInsira a data de devolucao(DD/MM/YYYY HH:MM): ");
        operacao.setDataLocacao(DataUtil.stringToDate(s.nextLine()));
    }

    private void fechar(Operacao operacao) {
        operacaoController.devolver(operacao);
    }

}
