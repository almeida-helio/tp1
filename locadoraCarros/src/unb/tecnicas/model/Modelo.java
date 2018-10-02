package unb.tecnicas.model;

public class Modelo implements  Cloneable{

    private int id;

    private String nome;

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

    public Modelo clone() {
        try {
            return (Modelo) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException in class operacao : "+e.getMessage());
            return null;
        }
    }

    public void imprime() {
        System.out.print(
                "\nid: " + id +
                "\nnome: " + nome
        );
    }

}
