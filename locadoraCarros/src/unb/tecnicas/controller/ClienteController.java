package unb.tecnicas.controller;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;

import java.util.List;

public interface ClienteController {

    void create(Cliente cliente);

    void update(Cliente cliente);

    void delete(int id);

    Cliente findOne(int id);

    List<Cliente> findAll();

}
