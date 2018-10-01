package unb.tecnicas.model;

import java.util.List;

public class Locadora extends  PessoaJuridica{

    private List<Carro> carroList;

    private List<Cliente> clienteList;

    private List<Transacao> transacaoList;

    private List<Marca> marcaList;

    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Transacao> getTransacaoList() {
        return transacaoList;
    }

    public void setTransacaoList(List<Transacao> transacaoList) {
        this.transacaoList = transacaoList;
    }

    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }

    @Override
    public String toString() {
        return "Locadora{" +
                "carroList=" + carroList +
                ", clienteList=" + clienteList +
                ", transacaoList=" + transacaoList +
                ", marcaList=" + marcaList +
                '}';
    }

    public Locadora clone() {
        return (Locadora) super.clone();
    }
}
