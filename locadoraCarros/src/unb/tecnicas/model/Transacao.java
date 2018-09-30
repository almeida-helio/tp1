package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioStatusTransacao;
import unb.tecnicas.model.enumeration.DominioTipoTransacao;

import java.time.LocalDateTime;
import java.util.List;

public class Transacao {

    private int id;

    private LocalDateTime dataInicio;

    private LocalDateTime dataFim;

    private double valor;

    private double desconto;

    private List<Multa> multaList;

    private Cliente locador;

    private Carro carro;

    private DominioStatusTransacao dominioStatusTransacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
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

    public List<Multa> getMultaList() {
        return multaList;
    }

    public void setMultaList(List<Multa> multaList) {
        this.multaList = multaList;
    }

    public Cliente getLocador() {
        return locador;
    }

    public void setLocador(Cliente locador) {
        this.locador = locador;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public DominioStatusTransacao getDominioStatusTransacao() {
        return dominioStatusTransacao;
    }

    public void setDominioStatusTransacao(DominioStatusTransacao dominioStatusTransacao) {
        this.dominioStatusTransacao = dominioStatusTransacao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", valor=" + valor +
                ", desconto=" + desconto +
                ", multaList=" + multaList +
                ", locador=" + locador +
                ", carro=" + carro +
                ", dominioStatusTransacao=" + dominioStatusTransacao +
                '}';
    }
}
