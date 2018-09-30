package unb.tecnicas.Repository;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulator {


    protected List<Carro> carroList;

    protected List<Transacao> transacaoList;

    protected Locadora locadora;

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public List<Carro> getCarroList() {
        return carroList;
    }

    public List<Transacao> getTransacaoList() {
        return transacaoList;
    }

    public Locadora getLocadora() {
        return locadora;
    }
}
