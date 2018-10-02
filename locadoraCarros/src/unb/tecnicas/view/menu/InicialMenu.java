package unb.tecnicas.view.menu;

import unb.tecnicas.controller.impl.AgenciaControllerImpl;
import unb.tecnicas.controller.impl.CarroControllerImpl;
import unb.tecnicas.controller.impl.ClienteControllerImpl;
import unb.tecnicas.controller.impl.OperacaoControllerImpl;
import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.view.locacao.AlugarView;
import unb.tecnicas.view.locacao.DevolverView;
import unb.tecnicas.view.printters.Listar;

public class InicialMenu extends Menu{


    private DatabaseSimulator databaseSimulator;

    private AlugarView alugarView;

    private DevolverView devolverView;

    private CarroControllerImpl carroController;

    private ClienteControllerImpl clienteController;

    private AgenciaControllerImpl agenciaController;

    private OperacaoControllerImpl operacaoController;

    public InicialMenu (DatabaseSimulator databaseSimulator) {
        this.databaseSimulator = databaseSimulator;
        this.alugarView = new AlugarView(this.databaseSimulator);
        this.devolverView = new DevolverView(this.databaseSimulator);
        this.carroController = new CarroControllerImpl(this.databaseSimulator.getCarroList());
        this.agenciaController = new AgenciaControllerImpl(this.databaseSimulator.getAgenciaList());
        this.operacaoController = new OperacaoControllerImpl(
                this.databaseSimulator.getOperacaoList(), this.databaseSimulator.getCarroList());
        this.clienteController = new ClienteControllerImpl(this.databaseSimulator.getClienteList());
    }

    @Override
    public  void seleciona(int o) {
        switch (o) {
            case 1:
                this.alugarView.alugar();
                break;
            case 2:
                this.devolverView.devolver();
                break;
            case 3:
                Listar.listarCliente(this.clienteController.findAll());
                break;
            case 4:
                Listar.listarCarro(this.carroController.findAll());
                break;
            case 5:
                Listar.listarAgencia(this.agenciaController.findAll());
                break;
            case 6:
                Listar.listarOperacao(this.operacaoController.findAll());
                break;
        }
    }

    @Override
    public void imprime() {
        System.out.println("---------------Limoeiro Locadora---------------");
        System.out.println("|Qual modulo deseja acessar (-1 para sair)?   |");
        System.out.println("|                                             |");
        System.out.println("|1 - Alugar                                   |");
        System.out.println("|2 - Devolver                                 |");
        System.out.println("|3 - Listar Cliente                           |");
        System.out.println("|4 - Listar Carro                             |");
        System.out.println("|5 - Listar Agencia                           |");
        System.out.println("|6 - Listar Operacao                          |");
        System.out.println("-----------------------------------------------");
    }

}
