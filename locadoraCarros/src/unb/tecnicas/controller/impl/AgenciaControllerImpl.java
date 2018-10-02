package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.AgenciaController;
import unb.tecnicas.model.Agencia;
import unb.tecnicas.repository.AgenciaRepository;

import java.util.List;

public class AgenciaControllerImpl implements AgenciaController {

    private static AgenciaRepository operacaoRepository;

    public AgenciaControllerImpl(List<Agencia> operacaoList) {
        this.operacaoRepository = new AgenciaRepository(operacaoList);
    }

    @Override
    public void create(Agencia operacao) {
        if (operacao.getId() != 0) {
            System.out.println("Erro ao criar operacao, id existente");
            return;
        }
        operacaoRepository.create(operacao);
    }

    @Override
    public void update(Agencia operacao) {
        operacaoRepository.update(operacao);
    }

    @Override
    public void delete(int id){
        if (id < 0) {
            System.out.println( "Erro ao deletar, " + id +" invalido");
            return;
        }
        operacaoRepository.delete(id);
    }

    @Override
    public Agencia findOne(int id) {
        if (id < 0) {
            System.out.println( "Erro ao procurar, " + id +" invalido");
            return null;
        }
        return operacaoRepository.findOne(id);
    }

    @Override
    public List<Agencia> findAll() {
        return operacaoRepository.findAll();
    }
}
