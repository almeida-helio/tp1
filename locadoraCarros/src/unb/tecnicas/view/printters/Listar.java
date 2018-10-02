package unb.tecnicas.view.printters;

import unb.tecnicas.model.Agencia;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Operacao;

import java.util.List;

public class Listar {

    public static void listarCarro(List<Carro> carroList) {
        carroList.forEach( f -> {
            System.out.print("\n\n");
            f.imprime();
        });
    }

    public static void listarOperacao(List<Operacao> operacaos) {
        operacaos.forEach( f -> {
            System.out.print("\n\n");
            f.imprime();
        });
    }

    public static void listarCliente(List<Cliente> clienteList) {
        clienteList.forEach( f -> {
            System.out.print("\n\n");
            f.imprime();
        });
    }


    public static void listarAgencia(List<Agencia> agenciaList) {
        agenciaList.forEach( f -> {
            System.out.print("\n\n");
            f.imprime();
        });
    }

}
