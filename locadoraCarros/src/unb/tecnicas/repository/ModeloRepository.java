package unb.tecnicas.repository;

import unb.tecnicas.model.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModeloRepository {

    private List<Modelo> modeloList;

    public ModeloRepository(List<Modelo> modeloList) {
        this.modeloList = modeloList;
    }

    public void create(Modelo modelo) {
        if (modelo.getId() != 0 || modelo.getId() < 0) {
            return;
        }
        modelo.setId(this.modeloList.size() + 1);
        this.modeloList.add(modelo);
    }

    public void update(Modelo modelo) {
        if (modelo.getId() < 0) {
            return;
        }
        // Obtenha uma lista com as modelos que possuam aquele id
        List<Modelo> m = this.getModeloListById(modelo.getId());
        if (m.size() != 1) {
            return;
        }
        this.modeloList.set(modeloList.indexOf(m.get(0)), modelo);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Modelo> m = this.getModeloListById(id);
        if (m.size() != 1) {
            return;
        }
        modeloList.remove(m.get(0));
    }

    public Modelo findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Modelo> m = getModeloListById(id);
        if (m.size() != 1) {
            return null;
        }
        return m.get(0).clone();
    }

    public List<Modelo> findAll() {
        List<Modelo> modeloList = new ArrayList<>(this.modeloList);
        return modeloList;
    }

    private List<Modelo> getModeloListById(int id) {
        return modeloList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }
}
