package unb.tecnicas.controller;

import unb.tecnicas.model.Locadora;

import java.util.List;

public interface LocadoraController {

    void create(Locadora locadora);

    void delete(int id);

    void update(Locadora locadora);

    Locadora findOne(int id);

    List<Locadora> findAll();
}
