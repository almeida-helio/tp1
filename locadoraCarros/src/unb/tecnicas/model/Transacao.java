package unb.tecnicas.model;

import java.time.LocalDateTime;

public class Transacao {

    private int id;

    private LocalDateTime dataLocacao;

    private LocalDateTime dataDevolucao;

    private LocalDateTime dataFim;

    private Cliente locador;

    private Carro alugado;

    private double valor;

    private double descontoPercentual;

    private double multaPercentual;

    private DominioStatusTransacao dominioStatusTransacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getLocador() {
        return locador;
    }

    public void setLocador(Cliente locador) {
        this.locador = locador;
    }

    public Carro getAlugado() {
        return alugado;
    }

    public void setAlugado(Carro alugado) {
        this.alugado = alugado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public double getMultaPercentual() {
        return multaPercentual;
    }

    public void setMultaPercentual(double multaPercentual) {
        this.multaPercentual = multaPercentual;
    }

    public DominioStatusTransacao getDominioStatusTransacao() {
        return dominioStatusTransacao;
    }

    public void setDominioStatusTransacao(DominioStatusTransacao dominioStatusTransacao) {
        this.dominioStatusTransacao = dominioStatusTransacao;
    }
}
