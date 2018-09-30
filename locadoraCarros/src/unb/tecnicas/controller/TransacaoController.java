package unb.tecnicas.controller;

import unb.tecnicas.model.Transacao;
import unb.tecnicas.model.enumeration.DominioStatusTransacao;

import java.time.LocalDateTime;
import java.util.List;

public interface TransacaoController {

    void create(Transacao transacao);

    void update(Transacao transacao);

    void delete(Transacao transacao);

    Transacao findOne(int id);

    List<Transacao> findAll();

    List<Transacao> findAllByStatus(DominioStatusTransacao dominioStatusTransacao);

    List<Transacao> findAllByCliente(int id);

    List<Transacao> findAllByCarro(int id);

    List<Transacao> findAllByDataInicio(LocalDateTime dataInicio);

    List<Transacao> findAllByDataFim(LocalDateTime dataFim);

    List<Transacao> findAllByDataInicioAndDataFim(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista);

}
