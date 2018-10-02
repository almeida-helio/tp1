package unb.tecnicas.repository;

import unb.tecnicas.model.Operacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperacaoRepository {

    private List<Operacao> operacaoList;

    public OperacaoRepository(List<Operacao> operacaoList) {
        this.operacaoList = operacaoList;
    }

    public void create(Operacao operacao) {
        if (operacao.getId() != 0 || operacao.getId() < 0) {
            return;
        }
        operacao.setId(this.operacaoList.size() + 1);
        this.operacaoList.add(operacao);
    }

    public void update(Operacao operacao) {
        if (operacao.getId() < 0) {
            return;
        }
        // Obtenha uma lista com as operacaos que possuam aquele id
        List<Operacao> o = this.getOperacaoListById(operacao.getId());
        if (o.size() != 1) {
            return;
        }
        this.operacaoList.set(operacaoList.indexOf(o.get(0)), operacao);
    }

    public void delete(int id) {
        if (id < 0) {
            return;
        }
        List<Operacao> o = this.getOperacaoListById(id);
        if (o.size() != 1) {
            return;
        }
        operacaoList.remove(o.get(0));
    }

    public Operacao findOne(int id) {
        if (id < 0) {
            return null;
        }
        List<Operacao> o = getOperacaoListById(id);
        if (o.size() != 1) {
            return null;
        }
        return o.get(0).clone();
    }

    public List<Operacao> findAll() {
        List<Operacao> operacaoList = new ArrayList<>(this.operacaoList);
        return operacaoList;
    }

    private List<Operacao> getOperacaoListById(int id) {
        return operacaoList.stream().filter( f -> f.getId() == id).collect(Collectors.toList());
    }

    public List<Operacao> findAllPendente() {
        List<Operacao> operacaoList = new ArrayList<>(this.operacaoList);
        return operacaoList.stream().filter( f-> f.getDataDevolucao() == null).collect(Collectors.toList());
    }
}
