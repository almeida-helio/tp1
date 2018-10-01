package unb.tecnicas.model;

import java.util.List;

public class Cliente extends PessoaFisica implements Cloneable{

    private List<Carro> carroList;



    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() + " " +
                ", carroList=" + carroList +
                '}';
    }

    public Cliente clone() {
        return (Cliente)super.clone();
    }

    public void imprime() {
        super.imprime();
        System.out.print(
                "\ncarroList = " +carroList
        );
    }
}
