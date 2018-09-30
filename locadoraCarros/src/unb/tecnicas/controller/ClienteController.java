package unb.tecnicas.controller;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Transacao;

import java.util.List;

public interface ClienteController {

    void create(Cliente cliente);

    void update(Cliente cliente);

    void delete(int id);

    Transacao alugar(Carro carro);

    void devolver(Transacao transacao);

    Cliente findOne(int id);

    List<Cliente> findAll();

}
