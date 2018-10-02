package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.ModeloController;
import unb.tecnicas.model.Modelo;
import unb.tecnicas.repository.ModeloRepository;

import java.util.List;

public class ModeloControllerImpl implements ModeloController {

    private static ModeloRepository modeloRepository;

    public ModeloControllerImpl(List<Modelo> modeloList) {
        this.modeloRepository = new ModeloRepository(modeloList);
    }

    @Override
    public void create(Modelo modelo) {
        if (modelo.getId() != 0) {
            System.out.println("Erro ao criar modelo, id existente");
            return;
        }
        modeloRepository.create(modelo);
    }

    @Override
    public void update(Modelo modelo) {
        modeloRepository.update(modelo);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        modeloRepository.delete(id);
    }

    @Override
    public Modelo findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return modeloRepository.findOne(id);
    }

    @Override
    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }
}
