package unb.tecnicas.repository;

import unb.tecnicas.model.Agencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgenciaRepository {

    private List<Agencia> agenciaList;

    public AgenciaRepository(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    public void create(Agencia agencia) {
        if (agencia.getId() != 0 || agencia.getId() < 0) {
            return;
        }
        agencia.setId(this.agenciaList.size() + 1);
        this.agenciaList.add(agencia);
    }

    public void update(Agencia agencia) {
        if (agencia.getId() < 0) {
            return;
        }
        // Obtenha uma lista com os agencias que possuem aquele id
        List<Agencia> a = this.getAgenciaListById(agencia.getId());
        if (a.size() != 1) {
            return;
        }
        this.agenciaList.set(agenciaList.indexOf(a.get(0)), agencia);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Agencia> a = this.getAgenciaListById(id);
        if (a.size() != 1) {
            return;
        }
        agenciaList.remove(a.get(0));
    }

    public Agencia findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Agencia> a = getAgenciaListById(id);
        if (a.size() != 1) {
            return null;
        }
        return a.get(0).clone();
    }

    public List<Agencia> findAll() {
        List<Agencia> agenciaList = new ArrayList<>(this.agenciaList);
        return agenciaList;
    }

    private List<Agencia> getAgenciaListById(int id) {
        return agenciaList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }
}
