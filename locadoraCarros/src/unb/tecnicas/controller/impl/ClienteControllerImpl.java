package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.ClienteController;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.repository.ClienteRepository;

import java.util.List;

public class ClienteControllerImpl implements ClienteController {

    private ClienteRepository clienteRepository;

    public ClienteControllerImpl(List<Cliente> clienteList) {
        clienteRepository = new ClienteRepository(clienteList);
    }

    @Override
    public void create(Cliente cliente) {
        if (cliente.getId() != 0) {
            System.out.println("Erro ao criar cliente, id existente");
            return;
        }
        this.clienteRepository.create(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        this.clienteRepository.update(cliente);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        this.clienteRepository.delete(id);
    }

    @Override
    public Cliente findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return this.clienteRepository.findOne(id);
    }

    @Override
    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }


}
