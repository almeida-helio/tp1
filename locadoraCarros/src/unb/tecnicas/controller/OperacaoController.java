package unb.tecnicas.controller;

import unb.tecnicas.model.Operacao;

import java.util.List;

public interface OperacaoController {

    void create(Operacao operacao);

    void delete(int id);

    void update(Operacao operacao);

    Operacao findOne(int id);

    List<Operacao> findAll();
}