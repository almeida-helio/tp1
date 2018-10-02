package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.CarroController;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;
import unb.tecnicas.repository.CarroRepository;

import java.util.List;

public class CarroControllerImpl implements CarroController {

    private CarroRepository carroRepository;


    public CarroControllerImpl(List<Carro> carroList) {
        this.carroRepository = new CarroRepository(carroList);
    }

    @Override
    public void create(Carro carro) {
        if (carro.getId() != 0) {
            System.out.println("Erro ao criar carro, id existente");
            return;
        }
        this.carroRepository.create(carro);
    }

    @Override
    public void update(Carro carro) {
        this.carroRepository.update(carro);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        this.carroRepository.delete(id);
    }

    @Override
    public Carro findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return this.carroRepository.findOne(id);
    }

    @Override
    public List<Carro> findAll() {
        return this.carroRepository.findAll();
    }

    @Override
    public List<Carro> findAllByStatusLocacao(DominioStatusLocacao dominioStatusLocacao) {
        return this.carroRepository.findAllByStatusLocacao(dominioStatusLocacao);
    }

    @Override
    public List<Carro> findAllDisponiveisByIdAgencia(int id) {
        return this.carroRepository.findAllDisponiveisByIdAgencia(id);
    }

}
