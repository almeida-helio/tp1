package unb.tecnicas.model;

import java.util.List;

public class Locadora extends  PessoaJuridica{

    private List<Carro> carroList;

    private List<Cliente> clienteList;

    private List<Transacao> transacaoList;

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

    public void addCliente(Cliente cliente){
        if (cliente.getId() != 0) {
            return;
        }
        cliente.setId(this.clienteList.size() + 1);
        this.clienteList.add(cliente);
    }

    public void addCarro(Carro carro){
        if (carro.getId() != 0) {
            return;
        }
        carro.setId(this.carroList.size() + 1);
        this.carroList.add(carro);
    }

    public void addTransacao(Transacao transacao) throws Exception{
        if (transacao.getId() != 0) {
            return;
        }
        transacao.setId(this.transacaoList.size() + 1);
        this.transacaoList.add(transacao);
    }



    @Override
    public String toString() {
        return "Locadora{" +
                "carroList=" + carroList +
                ", clienteList=" + clienteList +
                ", transacaoList=" + transacaoList +
                '}';
    }
}
