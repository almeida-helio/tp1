package unb.tecnicas.model;

import java.util.List;

public class PessoaJuridica {

    private String razaoSocial;

    private String cnpj;

    private List<PessoaFisica> responsaveis;

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

    public List<PessoaFisica> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<PessoaFisica> responsaveis) {
        this.responsaveis = responsaveis;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", responsaveis=" + responsaveis +
                '}';
    }
}
