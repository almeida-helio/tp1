package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioTipoPessoa;

public abstract class Pessoa implements Cloneable{

    private int id;

    private String nome;

    private String endereco;

    private String email;

    private String telefone;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public void imprime() {
        System.out.print(
                "id = " + id +
                "\nnome = "  + nome +
                "\nendereco = " + endereco +
                "\nemail = " + email +
                "\ntelefone = " + telefone
        );
    }

    public Pessoa clone() {
        try {
            return (Pessoa)super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException in class pessoa : "+e.getMessage());
            return null;
        }
    }
}