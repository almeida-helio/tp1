package unb.tecnicas.view.crud;

import java.io.IOException;
import java.util.Scanner;

public abstract class CrudView {

    private String entityName;

    public CrudView(String entityName) {
        this.entityName = entityName;
    }

    public abstract void cadastrar();

    public abstract void deletar();

    public abstract void atualizar();

    public abstract void listar();

    public abstract void doQuestions(Object object);

    public void imprimeMenu() {
        System.out.println("Manter " + entityName +": ");
        System.out.println("\t1 - Cadastrar");
        System.out.println("\t2 - Atualizar");
        System.out.println("\t3 - Deletar");
        System.out.println("\t4 - Listar");
        System.out.println("\t-1- Sair");
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        do {
            try{
                Runtime.getRuntime().exec("clear");
            } catch (IOException i) {
                System.out.println("Erro ao limpar tela terminal" + i.getMessage());
                break;
            }
            this.imprimeMenu();
            int o = s.nextInt();
            if (o < 0) {
                break;
            }
            this.seleciona(o);
            this.espere();
        } while (Boolean.TRUE);
    }


    private void seleciona(int o) {
        switch (o) {
            case 1:
                this.cadastrar();
                break;
            case 2:
                this.atualizar();
                break;
            case 3:
                this.deletar();
                break;
            case 4:
                this.listar();
                break;
            default:
                System.out.println("Opcao Invalida!");
                break;
        }
    }

    private void espere() {
        Scanner s = new Scanner(System.in);
        System.out.println("Tecle enter para continuar");
        s.nextLine();
    }
}
