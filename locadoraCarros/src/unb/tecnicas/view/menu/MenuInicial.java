package unb.tecnicas.view.menu;

import java.io.IOException;
import java.util.Scanner;

public final class MenuInicial {

    public static void menuInicial() {
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                Runtime.getRuntime().exec("clear");
            } catch (IOException i) {
                System.out.println("Erro ao limpar tela terminal" + i.getMessage());
                break;
            }
            imprime();
            int o = scanner.nextInt();
            if (o < 0) {
                break;
            }
            seleciona(o);
            espere();
        } while (Boolean.TRUE);
    }

    private static void seleciona(int o) {
        if (o == 1) {
            ManterMenu.manterMenu();
        } else if (o == 2){
            TransacaoMenu.transacaoMenu();
        }
    }

    public static void imprime() {
        System.out.println("---------------Limoeiro Locadora---------------");
        System.out.println("|Qual modulo deseja acessar (-1 para sair)?   |");
        System.out.println("|                                             |");
        System.out.println("|1 - Manter entidades (carro, cliente, ...)   |");
        System.out.println("|2 - Aluguel e devolucao de carros            |");
        System.out.println("-----------------------------------------------");
    }

    private static void espere() {
        Scanner s = new Scanner(System.in);
        System.out.println("Tecle enter para continuar");
        s.nextLine();
    }
}
