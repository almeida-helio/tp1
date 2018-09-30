package unb.tecnicas.controller;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.util.List;

public interface CarroController {


    void create(Carro carro);

    void delete(int id);

    void update(Carro carro);

    Carro findOne(int id);

    List<Carro> findAll();

    List<Carro> findAllByStatusLocacao(DominioStatusLocacao dominioStatusLocacao);

}
