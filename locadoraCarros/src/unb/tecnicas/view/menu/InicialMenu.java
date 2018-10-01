package unb.tecnicas.view.menu;

public class InicialMenu extends Menu{

    ManterMenu manterMenu = new ManterMenu();
    TransacaoMenu transacaoMenu = new TransacaoMenu();

    @Override
    public  void seleciona(int o) {
        if (o == 1) {
            this.manterMenu.menu();
        } else if (o == 2){
            this.transacaoMenu.menu();
        }
    }

    @Override
    public void imprime() {
        System.out.println("---------------Limoeiro Locadora---------------");
        System.out.println("|Qual modulo deseja acessar (-1 para sair)?   |");
        System.out.println("|                                             |");
        System.out.println("|1 - Manter entidades (carro, cliente, ...)   |");
        System.out.println("|2 - Aluguel e devolucao de carros            |");
        System.out.println("-----------------------------------------------");
    }

}
