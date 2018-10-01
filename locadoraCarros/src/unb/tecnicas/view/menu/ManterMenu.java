package unb.tecnicas.view.menu;

import unb.tecnicas.model.Cliente;
import unb.tecnicas.view.crud.CarroView;
import unb.tecnicas.view.crud.ClienteView;
import unb.tecnicas.view.crud.LocadoraView;
import unb.tecnicas.view.crud.MarcaView;

public class ManterMenu extends Menu{

    CarroView carroView = new CarroView();
    LocadoraView locadoraView = new LocadoraView();
    MarcaView marcaView = new MarcaView();
    ClienteView clienteView = new ClienteView();


    @Override
    protected void seleciona(int o) {
        switch (o) {
            case 1:
                carroView.menu();
                break;
            case 2:
                clienteView.menu();
                break;
            case 3:
                marcaView.menu();
                break;
            case 4:
                locadoraView.menu();
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }

    @Override
    public  void imprime() {
        System.out.println("---------------Limoeiro Locadora---------------");
        System.out.println("|Qual modulo deseja acessar (-1 para sair)?   |");
        System.out.println("|                                             |");
        System.out.println("|1 - Manter carro                             |");
        System.out.println("|2 - Manter cliente                           |");
        System.out.println("|3 - Manter marca                             |");
        System.out.println("|4 - Manter locadora                          |");
        System.out.println("-----------------------------------------------");
    }
}
