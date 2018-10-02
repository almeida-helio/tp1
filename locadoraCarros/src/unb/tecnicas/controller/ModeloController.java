package unb.tecnicas.controller;

import unb.tecnicas.model.Modelo;

import java.util.List;

public interface ModeloController {

    void create(Modelo modelo);

    void delete(int id);

    void update(Modelo modelo);

    Modelo findOne(int id);

    List<Modelo> findAll();
}
