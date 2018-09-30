package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioTipoPessoa;

public class Pessoa {

    private int id;

    private String nome;

    private String endereco;

    private String email;

    private String telefone;

    private DominioTipoPessoa tipoPessoa;

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

    public DominioTipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(DominioTipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }

    public void imprime() {
        System.out.print(
                "id = " + id +
                "\nnome = "  + nome +
                "\nendereco = " + endereco +
                "\nemail = " + email +
                "\ntelefone = " + telefone +
                "\ntipoPesso = " + tipoPessoa.getDescricao()
        );
    }
}