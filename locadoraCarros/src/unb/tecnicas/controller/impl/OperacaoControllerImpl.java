package unb.tecnicas.controller.impl;

import unb.tecnicas.controller.OperacaoController;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Operacao;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;
import unb.tecnicas.repository.CarroRepository;
import unb.tecnicas.repository.OperacaoRepository;

import java.time.Duration;
import java.util.List;

public class OperacaoControllerImpl implements OperacaoController {


    private static OperacaoRepository operacaoRepository;

    private static CarroControllerImpl carroController;

    public OperacaoControllerImpl(List<Operacao> operacaoList, List<Carro> carroList) {
        this.carroController = new CarroControllerImpl(carroList);
        this.operacaoRepository = new OperacaoRepository(operacaoList);
    }

    @Override
    public void create(Operacao operacao) {
        if (operacao.getId() != 0) {
            System.out.println("Erro ao criar operacao, id existente");
            return;
        }
        operacaoRepository.create(operacao);
    }

    @Override
    public void update(Operacao operacao) {
        operacaoRepository.update(operacao);
    }

    @Override
    public void delete(int id) {
        if (id < 0) {
            System.out.println("Erro ao deletar, " + id + " invalido");
            return;
        }
        operacaoRepository.delete(id);
    }

    @Override
    public Operacao findOne(int id) {
        if (id < 0) {
            System.out.println("Erro ao procurar, " + id + " invalido");
            return null;
        }
        return operacaoRepository.findOne(id);
    }

    @Override
    public List<Operacao> findAll() {
        return operacaoRepository.findAll();
    }


    @Override
    public void alugar(Operacao operacao) {
        Carro carro = carroController.findOne(operacao.getIdCarro());
        carro.setStatusLocacao(DominioStatusLocacao.E);
        carroController.update(carro);
        this.create(operacao);
    }

    @Override
    public void devolver(Operacao operacao) {
        Carro carro = carroController.findOne(operacao.getIdCarro());
        carro.setStatusLocacao(DominioStatusLocacao.D);
        carroController.update(carro);
        operacao.setValor(this.calculaValorFinal(operacao));
        this.update(operacao);
    }

    @Override
    public List<Operacao> findAllPendente() {
        return operacaoRepository.findAllPendente();
    }

    @Override
    public double calculaValorFinal(Operacao operacao) {
        Carro carro = carroController.findOne(operacao.getIdCarro());
        Long days = Duration.between(operacao.getDataLocacao(), operacao.getDataDevolucao()).toDays();
        double valorTotal = carro.getValorDiaria()*days;
        return valorTotal - valorTotal*operacao.getDesconto() + valorTotal*operacao.getMulta();
    }


}
