package unb.tecnicas;

import unb.tecnicas.repository.ClienteRepository;
import unb.tecnicas.repository.DatabaseSimulator;

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
