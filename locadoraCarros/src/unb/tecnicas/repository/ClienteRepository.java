package unb.tecnicas.repository;

import unb.tecnicas.model.Cliente;

import java.util.ArrayList;
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
        List<Cliente> c = this.getClienteListById(cliente.getId());
        if (c.size() != 1) {
            return;
        }
        this.clienteList.set(clienteList.indexOf(c.get(0)), cliente);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Cliente> c = this.getClienteListById(id);
        if (c.size() != 1) {
            return;
        }
        clienteList.remove(c.get(0));
    }

    public Cliente findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Cliente> c = getClienteListById(id);
        if (c.size() != 1) {
            return null;
        }
        return c.get(0).clone();
    }

    public List<Cliente> findAll() {
        List<Cliente> clienteList = new ArrayList<>(this.clienteList);
        return clienteList;
    }

    private List<Cliente> getClienteListById(int id) {
        return clienteList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }



}
