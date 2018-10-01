package unb.tecnicas.repository;

import unb.tecnicas.carga.ClienteCarga;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Marca;
import unb.tecnicas.model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulator {


    protected static List<Carro> carroList = new ArrayList<>();

    protected static List<Marca> marcaList = new ArrayList<>();

    protected static List<Transacao> transacaoList = new ArrayList<>();

    protected static List<Cliente> clienteList = new ArrayList<>();

    protected static Locadora locadora;

    public DatabaseSimulator(Locadora locadora1, String opc) {
        locadora = locadora1;
        if (opc.equalsIgnoreCase("n")) {
            locadora.setCarroList(new ArrayList<>());
            locadora.setClienteList(new ArrayList<>());
            locadora.setTransacaoList(new ArrayList<>());
        } else {
            locadora.setClienteList(ClienteCarga.gerarClientes());
        }

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
