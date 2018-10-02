package unb.tecnicas.view.menu;

import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.view.locacao.AlugarView;
import unb.tecnicas.view.locacao.DevolverView;

public class InicialMenu extends Menu{


    private DatabaseSimulator databaseSimulator;

    private AlugarView alugarView;

    private DevolverView devolverView;
    public InicialMenu (DatabaseSimulator databaseSimulator) {
        this.databaseSimulator = databaseSimulator;
        this.alugarView = new AlugarView(this.databaseSimulator);
        this.devolverView = new DevolverView(this.databaseSimulator);
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
        System.out.println("|6 - Listar Operacoes                         |");
        System.out.println("-----------------------------------------------");
    }

}
