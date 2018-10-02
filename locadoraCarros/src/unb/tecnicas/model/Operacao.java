package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioTipoLocacao;

import java.time.LocalDateTime;

public class Operacao implements Cloneable{

    private int id;

    private int idCliente;

    private int idAgencia;

    private int idCarro;

    private DominioTipoLocacao dominioTipoLocacao;

    private LocalDateTime dataLocacao;

    private LocalDateTime dataDevolucaoPrevista;

    private LocalDateTime dataDevolucao;

    private double valor;

    private double desconto;

    private double multa;

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

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
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

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public Operacao clone() {
        try {
            return (Operacao) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException in class operacao : "+e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", idAgencia=" + idAgencia +
                ", idCarro=" + idCarro +
                ", dominioTipoLocacao=" + dominioTipoLocacao +
                ", dataLocacao=" + dataLocacao +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista +
                ", dataDevolucao=" + dataDevolucao +
                ", valor=" + valor +
                ", desconto=" + desconto +
                ", multa=" + multa +
                '}';
    }

    public void imprime() {
        String locacao = dataLocacao == null ? " " : (
                dataLocacao.toLocalDate().toString() + " " + dataLocacao.toLocalTime().toString());

        String devolucao = dataDevolucao == null ? " " : (
                dataDevolucao.toLocalDate().toString() + " " + dataDevolucao.toLocalTime().toString());

        String prevista = dataDevolucaoPrevista == null ? " " :
                (dataDevolucaoPrevista.toLocalTime().toString() + " " + dataDevolucaoPrevista.toLocalTime().toString());

        System.out.print(
                "\nid : " + id+
                "\nidCliente : " + idCliente +
                "\nidAgencia : " + idAgencia +
                "\nidCarro :" + idCarro +
                "\ndataLocacao : " + locacao +
                "\ndataDevolucao : " + devolucao +
                "\ndataDevolucaoPrevista : " + prevista  +
                "\nvalor : " + valor
        );
    }

    public void imprimeResumo() {
        System.out.print(
                "\nid: " + id +
                "\nidCarro: " + idCarro +
                "\nidCliente: " + idCliente
        );
    }

}
