package unb.tecnicas.model;

import java.util.List;

public class Locadora extends  PessoaJuridica{

    private int quantidadeAgencia;

    public int getQuantidadeAgencia() {
        return quantidadeAgencia;
    }

    public void setQuantidadeAgencia(int quantidadeAgencia) {
        this.quantidadeAgencia = quantidadeAgencia;
    }

    public Locadora clone() {
        return (Locadora) super.clone();
    }
}
