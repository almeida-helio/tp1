package unb.tecnicas.repository;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarroRepository {

    private List<Carro> carroList = DatabaseSimulator.carroList;

    public void create(Carro carro) {
        if (carro.getId() != 0 || carro.getId() < 0) {
            return;
        }
        carro.setId(this.carroList.size() + 1);
        this.carroList.add(carro);
    }

    public void update(Carro carro) {
        if (carro.getId() < 0) {
            return;
        }
        // Obtenha uma lista com os carros que possuem aquele id
        List<Carro> c = this.getCarroListById(carro.getId());
        if (c.size() != 1) {
            return;
        }
        this.carroList.set(carroList.indexOf(c.get(0)), carro);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Carro> c = this.getCarroListById(id);
        if (c.size() != 1) {
            return;
        }
        carroList.remove(c.get(0));
    }

    public Carro findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Carro> c = getCarroListById(id);
        if (c.size() != 1) {
            return null;
        }
        return c.get(0).clone();
    }

    public List<Carro> findAll() {
        List<Carro> carroList = new ArrayList<>(this.carroList);
        return carroList;
    }

    public List<Carro> findAllByStatusLocacao(DominioStatusLocacao dominioStatusLocacao) {
        List<Carro> carroList = this.carroList.stream().filter( f ->
                f.getStatusLocacao().equals(dominioStatusLocacao)).collect(Collectors.toList());
        return new ArrayList<>(carroList);
    }

    private List<Carro> getCarroListById(int id) {
        return carroList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }


}
