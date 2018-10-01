package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.LocadoraController;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.repository.LocadoraRepository;

import java.util.List;

public class LocadoraControllerImpl implements LocadoraController {


    private static final LocadoraRepository locadoraRepository = new LocadoraRepository();


    @Override
    public void create(Locadora locadora) {
        if (locadora.getId() != 0) {
            System.out.println("Erro ao criar locadora, id existente");
            return;
        }
        locadoraRepository.create(locadora);
    }

    @Override
    public void update(Locadora locadora) {
        locadoraRepository.update(locadora);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        locadoraRepository.delete(id);
    }

    @Override
    public Locadora findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return locadoraRepository.findOne(id);
    }

    @Override
    public List<Locadora> findAll() {
        return locadoraRepository.findAll();
    }
}
