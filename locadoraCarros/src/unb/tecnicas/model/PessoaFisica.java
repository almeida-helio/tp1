package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioSexo;

public class PessoaFisica extends Pessoa{

    private String cpf;

    private String rg;

    private DominioSexo sexo;

    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    @Override
    public String toString() {
        return "PessoaFisica{" +
                super.toString() + " " +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }

    public void imprime() {
        super.imprime();
        System.out.print(
                "\ncpf = " + cpf +
                "\nrg = "  + rg +
                "\nsexo = " + sexo.getDescricao() +
                "\nidade = " + idade
        );
    }
}
