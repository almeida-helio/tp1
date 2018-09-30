package unb.tecnicas.Repository;

import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteRepository {

    private List<Cliente> clienteList;


    public ClienteRepository(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void create(Cliente cliente) {
        if (cliente.getId() != 0 || cliente.getId() < 0) {
            return;
        }
        cliente.setId(this.clienteList.size() + 1);
        this.clienteList.add(cliente);
    }

    public void update(Cliente cliente) {
        if (cliente.getId() < 0) {
            return;
        }
        // Obtenha uma lista com os clientes que possuem aquele id
        List<Cliente> c = clienteList.stream().filter( f -> f.getId() == cliente.getId()).collect(Collectors.toList());
        if (c.size() > 1) {
            return;
        }
        this.clienteList.set(clienteList.indexOf(c.get(0)), cliente);
    }



}
