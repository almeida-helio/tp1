package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.time.Year;
import java.util.List;

public class Carro {

    private int id;

    private String modelo;

    private Year ano;

    private Marca marca;

    private int numeroPortas;

    private int numeroBancos;

    private String renavam;

    private double quilometrosRodados;

    private String placa;

    private DominioStatusLocacao statusLocacao;

    private double valorLocacao;

    private List<Multa> multa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroBancos() {
        return numeroBancos;
    }

    public void setNumeroBancos(int numeroBancos) {
        this.numeroBancos = numeroBancos;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public double getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(double quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public DominioStatusLocacao getStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(DominioStatusLocacao statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Multa> getMulta() {
        return multa;
    }

    public void setMulta(List<Multa> multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", marca=" + marca +
                ", numeroPortas=" + numeroPortas +
                ", numeroBancos=" + numeroBancos +
                ", renavam='" + renavam + '\'' +
                ", quilometrosRodados=" + quilometrosRodados +
                ", placa='" + placa + '\'' +
                ", statusLocacao=" + statusLocacao +
                ", valorLocacao=" + valorLocacao +
                ", multa=" + multa +
                '}';
    }
}
