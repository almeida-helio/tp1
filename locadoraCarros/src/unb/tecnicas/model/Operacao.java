package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioTipoLocacao;

public class Operacao {

    private int id;

    private int idCliente;

    private int idAgencia;

    private int idCarro;

    private DominioTipoLocacao dominioTipoLocacao;

    private String dataLocacao;

    private String dataDevolucaoPrevista;

    private String dataDevolucao;

    private double valor;

    private double desconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public DominioTipoLocacao getDominioTipoLocacao() {
        return dominioTipoLocacao;
    }

    public void setDominioTipoLocacao(DominioTipoLocacao dominioTipoLocacao) {
        this.dominioTipoLocacao = dominioTipoLocacao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
