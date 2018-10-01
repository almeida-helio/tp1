package unb.tecnicas.view.menu;

import java.io.IOException;
import java.util.Scanner;

public abstract class Menu {


    protected abstract void seleciona(int o);

    protected abstract void imprime() ;

    public void menu() {
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
            this.seleciona(o);
            this.espere();
        } while (Boolean.TRUE);
    }

    private static void espere() {
        Scanner s = new Scanner(System.in);
        System.out.println("Tecle enter para continuar");
        s.nextLine();
    }
}
