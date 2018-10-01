package unb.tecnicas.model;

public class Marca implements Cloneable {

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

    public Marca clone() {
        try {
            return (Marca)super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException in class marca : "+e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void imprime() {
        System.out.println(
                "\nid :" + id +
                "\nnome: " + nome
        );
    }
}
