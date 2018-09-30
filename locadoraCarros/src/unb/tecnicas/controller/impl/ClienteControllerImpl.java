package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.ClienteController;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Transacao;

import java.util.List;

public class ClienteControllerImpl implements ClienteController {

    private Locadora locadora;

    public ClienteControllerImpl(Locadora locadora) {
        this.locadora = locadora;
    }

    @Override
    public void create(Cliente cliente){
        this.locadora.addCliente(cliente);
    }

    @Override
    public void update(Cliente cliente){
        
    }

    @Override
    void delete(int id){

    }

    @Override
    Transacao alugar(Carro carro);

    @Override
    void devolver(Transacao transacao);

    @Override
    Cliente findOne(int id);

    @Override
    List<Cliente> findAll();

}
