package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioSexo;

public abstract class PessoaFisica extends Pessoa implements Cloneable{

    private String cpf;

    private DominioSexo sexo;

    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public DominioSexo getSexo() {
        return sexo;
    }

    public void setSexo(DominioSexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime() {
        super.imprime();
        System.out.print(
                "\ncpf = " + cpf +
                "\nsexo = " + sexo.getDescricao() +
                "\nidade = " + idade
        );
    }

    public PessoaFisica clone() {
        return (PessoaFisica) super.clone();
    }
}
