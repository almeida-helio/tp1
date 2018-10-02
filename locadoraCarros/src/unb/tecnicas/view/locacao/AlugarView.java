package unb.tecnicas.view.locacao;

import unb.tecnicas.controller.impl.AgenciaControllerImpl;
import unb.tecnicas.controller.impl.CarroControllerImpl;
import unb.tecnicas.controller.impl.ClienteControllerImpl;
import unb.tecnicas.controller.impl.LocadoraControllerImpl;
import unb.tecnicas.controller.impl.OperacaoControllerImpl;
import unb.tecnicas.model.Agencia;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Operacao;
import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.util.ProcessaDados;
import unb.tecnicas.view.printters.ListarResumo;

import java.util.Arrays;
import java.util.List;

public class AlugarView {

    ClienteControllerImpl clienteController;

    CarroControllerImpl carroController;

    AgenciaControllerImpl agenciaController;

    OperacaoControllerImpl operacaoController;

    LocadoraControllerImpl locadoraController;

    public AlugarView(DatabaseSimulator databaseSimulator) {
        this.clienteController = new ClienteControllerImpl(databaseSimulator.getClienteList());
        this.carroController = new CarroControllerImpl(databaseSimulator.getCarroList());
        this.agenciaController = new AgenciaControllerImpl(databaseSimulator.getAgenciaList());
        this.operacaoController = new OperacaoControllerImpl(databaseSimulator.getOperacaoList(),
                databaseSimulator.getCarroList());
        this.locadoraController = new LocadoraControllerImpl(databaseSimulator.getLocadoraList());
    }

    public void alugar() {
        Operacao operacao = new Operacao();
        this.selecionarCliente(operacao);
        this.selecionarAgencia(operacao);
        this.selecionaCarro(operacao);
        this.obterDadosOperacao(operacao);
        this.salvar(operacao);
    }

    private void selecionarCliente(Operacao operacao) {
        List<Cliente> clienteList = clienteController.findAll();
        List<Integer> integers = Arrays.asList(clienteList.stream().map(c -> c.getId()).toArray(Integer[]::new));
        ListarResumo.listarCliente(clienteList);
        String msg = "Informe o id do cliente que ira alugar o carro: ";
        int id = ProcessaDados.getValidId(integers, msg);
        operacao.setIdCliente(id);
    }

    private void selecionaCarro(Operacao operacao) {
        List<Carro> carroList = carroController.findAllDisponiveisByIdAgencia(operacao.getIdAgencia());
        List<Integer> integers = Arrays.asList(carroList.stream().map(c -> c.getId()).toArray(Integer[]::new));
        ListarResumo.listarCarro(carroList);
        String msg = "Informe o id do carro que deseja alugar: ";
        int id = ProcessaDados.getValidId(integers, msg);
        operacao.setIdCarro(id);
    }


    private void selecionarAgencia(Operacao operacao) {
        List<Agencia> agenciaList = agenciaController.findAll();
        List<Integer> integers = Arrays.asList(agenciaList.stream().map(c -> c.getId()).toArray(Integer[]::new));
        ListarResumo.listarAgencia(agenciaList);
        String msg = "Informe o id da agencia na qual o carro sera alugado: ";
        int id = ProcessaDados.getValidId(integers, msg);
        operacao.setIdAgencia(id);

    }

    private void obterDadosOperacao(Operacao operacao) {

        operacao.setDataLocacao(ProcessaDados.getValidDate(
                "Insira a data de emprestimo(DD/MM/YYYY HH:MM): "));
        operacao.setDataDevolucaoPrevista(ProcessaDados.getValidDate(
                "Insira a data prevista de devolucao(DD/MM/YYYY HH:MM): "));
        operacaoController.calculaPreco(operacao, carroController.findOne(operacao.getIdCarro()).getValorDiaria());
    }

    private void salvar (Operacao operacao) {
        operacaoController.alugar(operacao);
    }


}
