package unb.tecnicas.controller;

import unb.tecnicas.model.Marca;

public interface MarcaController {

    void create(Marca marca);

    void update(Marca marca);

    void delete(int id);
}
