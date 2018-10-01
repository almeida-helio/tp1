package unb.tecnicas.model;

import unb.tecnicas.model.enumeration.DominioStatus;

public class Cliente extends PessoaFisica implements Cloneable {


    private DominioStatus dominioStatus;

    public DominioStatus getDominioStatus() {
        return dominioStatus;
    }

    public void setDominioStatus(DominioStatus dominioStatus) {
        this.dominioStatus = dominioStatus;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dominioStatus=" + dominioStatus +
                '}';
    }

    public Cliente clone() {
        return (Cliente) super.clone();
    }

    public void imprime() {
        super.imprime();
        System.out.print(
                "\nstatus = " + dominioStatus.getDescricao()
        );
    }
}
