package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.MarcaController;
import unb.tecnicas.model.Marca;
import unb.tecnicas.repository.MarcaRepository;

import java.util.List;

public class MarcaControllerImpl implements MarcaController {
    
    private static final MarcaRepository marcaRepository = new MarcaRepository();


    @Override
    public void create(Marca marca) {
        if (marca.getId() != 0) {
            System.out.println("Erro ao criar marca, id existente");
            return;
        }
        marcaRepository.create(marca);
    }

    @Override
    public void update(Marca marca) {
        marcaRepository.update(marca);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        marcaRepository.delete(id);
    }

    @Override
    public Marca findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return marcaRepository.findOne(id);
    }

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

}
