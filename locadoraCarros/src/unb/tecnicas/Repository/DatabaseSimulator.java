package unb.tecnicas.Repository;

import unb.tecnicas.carga.ClienteCarga;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulator {


    private List<Carro> carroList = new ArrayList<>();

    private List<Transacao> transacaoList = new ArrayList<>();

    private List<Cliente> clienteList = new ArrayList<>();

    private Locadora locadora = new Locadora();

    public DatabaseSimulator() {
        clienteList.addAll(ClienteCarga.gerarClientes());
    }

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
