package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.time.Year;

public class Carro implements Cloneable {

    private int id;

    private Modelo modelo;

    private Year ano;

    private String marca;

    private int numeroPortas;

    private int numeroBancos;

    private double quilometrosRodados;

    private String placa;

    private String renavam;

    private DominioStatusLocacao statusLocacao;

    private double valorDiaria;

    private Agencia agencia;

    private String cor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Carro clone() {
        try {
            return (Carro)super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException in class carro : "+e.getMessage());
            return null;
        }
    }

    public void imprime() {
        System.out.print(
                "\nid: " + id);
        System.out.print("\nModelo {");
        modelo.imprime();
        System.out.print("}");
        System.out.print(
                "\nano: " + ano.toString() +
                "\ncor: " + cor +
                "\nmarca: "+ marca +
                "\nnumeroPortas: " + numeroPortas +
                "\nnumeroBancos: " + numeroBancos +
                "\nrenavam: " + renavam +
                "\nquilometrosRodados: " + quilometrosRodados +
                "\nplaca: " + placa +
                "\nstatusLocacao: " + statusLocacao.getDescricao() +
                "\nvalorDiaria: " + valorDiaria
        );
        System.out.print("\nAgencia {\n");
        agencia.imprime();
        System.out.print("\n}");
    }

    public void imprimeResumo() {
        System.out.print(
                "\nid: " + id +
                "\nmarca: " + marca +
                "\nmodelo: " + modelo.getNome() +
                "\ncor: " + cor
        );
    }
}
