package unb.tecnicas.controller;

import unb.tecnicas.model.Agencia;

import java.util.List;

public interface AgenciaController {

    void create(Agencia agencia);

    void delete(int id);

    void update(Agencia agencia);

    Agencia findOne(int id);

    List<Agencia> findAll();

}
