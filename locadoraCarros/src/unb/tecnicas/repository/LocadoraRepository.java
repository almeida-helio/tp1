package unb.tecnicas.repository;

import unb.tecnicas.model.Locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LocadoraRepository {

    private List<Locadora> locadoraList = DatabaseSimulator.locadoraList;

    public void create(Locadora locadora) {
        if (locadora.getId() != 0 || locadora.getId() < 0) {
            return;
        }
        locadora.setId(this.locadoraList.size() + 1);
        this.locadoraList.add(locadora);
    }

    public void update(Locadora locadora) {
        if (locadora.getId() < 0) {
            return;
        }
        // Obtenha uma lista com as locadoras que possuam aquele id
        List<Locadora> l = this.getLocadoraListById(locadora.getId());
        if (l.size() != 1) {
            return;
        }
        this.locadoraList.set(locadoraList.indexOf(l.get(0)), locadora);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Locadora> l = this.getLocadoraListById(id);
        if (l.size() != 1) {
            return;
        }
        locadoraList.remove(l.get(0));
    }

    public Locadora findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Locadora> l = getLocadoraListById(id);
        if (l.size() != 1) {
            return null;
        }
        return l.get(0).clone();
    }

    public List<Locadora> findAll() {
        List<Locadora> locadoraList = new ArrayList<>(this.locadoraList);
        return locadoraList;
    }

    private List<Locadora> getLocadoraListById(int id) {
        return locadoraList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }


}
