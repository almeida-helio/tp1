package unb.tecnicas.model;

public abstract class PessoaJuridica  extends Pessoa{

    private String razaoSocial;

    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica clone() {
        return (PessoaJuridica) super.clone();
    }
}
