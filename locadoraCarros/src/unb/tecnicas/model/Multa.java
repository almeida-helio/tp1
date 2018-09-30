package unb.tecnicas.model;

import java.time.LocalDateTime;

public class Multa {

    private int id;

    private LocalDateTime data;

    private double valor;

    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
