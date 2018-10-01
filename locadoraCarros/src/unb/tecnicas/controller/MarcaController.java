package unb.tecnicas.controller;

import unb.tecnicas.model.Marca;

import java.util.List;

public interface MarcaController {

    void create(Marca marca);

    void update(Marca marca);

    void delete(int id);

    Marca findOne(int id);

    List<Marca> findAll();
}
