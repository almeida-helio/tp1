package unb.tecnicas;

import unb.tecnicas.Repository.ClienteRepository;
import unb.tecnicas.Repository.DatabaseSimulator;

public class Main {

    public static void main(String[] args) {
        DatabaseSimulator database = new DatabaseSimulator();
        ClienteRepository clienteRepository = new ClienteRepository(database.getClienteList());
        clienteRepository.delete(6);
        clienteRepository.findAll().forEach( cliente -> {
            System.out.println("\n ----- \n");
            cliente.imprime();
            System.out.println("\n ----- \n");
        });


    }
}
