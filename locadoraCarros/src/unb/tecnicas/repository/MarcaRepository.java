package unb.tecnicas.repository;

import unb.tecnicas.model.Marca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarcaRepository {

    private List<Marca> marcaList = DatabaseSimulator.marcaList;

    public void create(Marca marca) {
        if (marca.getId() != 0 || marca.getId() < 0) {
            return;
        }
        marca.setId(this.marcaList.size() + 1);
        this.marcaList.add(marca);
    }

    public void update(Marca marca) {
        if (marca.getId() < 0) {
            return;
        }
        // Obtenha uma lista com as marcas que possuem aquele id
        List<Marca> m = this.getMarcaListById(marca.getId());
        if (m.size() != 1) {
            return;
        }
        this.marcaList.set(marcaList.indexOf(m.get(0)), marca);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Marca> m = this.getMarcaListById(id);
        if (m.size() != 1) {
            return;
        }
        marcaList.remove(m.get(0));
    }

    public Marca findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Marca> m = getMarcaListById(id);
        if (m.size() != 1) {
            return null;
        }
        return m.get(0).clone();
    }

    public List<Marca> findAll() {
        List<Marca> marcaList = new ArrayList<>(this.marcaList);
        return marcaList;
    }

    private List<Marca> getMarcaListById(int id) {
        return marcaList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }

}
