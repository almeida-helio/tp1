package unb.tecnicas.model;

import java.util.List;

public class Cliente extends PessoaFisica{

    private int numeroMaximoAluguel;

    private double saldo;

    private List<Transacao> transacaoList;

    private List<Carro> carroList;

    public int getNumeroMaximoAluguel() {
        return numeroMaximoAluguel;
    }

    public void setNumeroMaximoAluguel(int numeroMaximoAluguel) {
        this.numeroMaximoAluguel = numeroMaximoAluguel;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacaoList() {
        return transacaoList;
    }

    public void setTransacaoList(List<Transacao> transacaoList) {
        this.transacaoList = transacaoList;
    }

    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroMaximoAluguel=" + numeroMaximoAluguel +
                ", saldo=" + saldo +
                ", transacaoList=" + transacaoList +
                ", carroList=" + carroList +
                '}';
    }
}
