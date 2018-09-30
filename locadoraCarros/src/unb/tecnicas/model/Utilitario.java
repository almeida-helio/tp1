package unb.tecnicas.model;

public class Utilitario {

    private int id;

    private String nome;

    private String descricao;

    private double valorAgregado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorAgregado() {
        return valorAgregado;
    }

    public void setValorAgregado(double valorAgregado) {
        this.valorAgregado = valorAgregado;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorAgregado=" + valorAgregado +
                '}';
    }
}
