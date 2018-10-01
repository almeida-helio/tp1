package unb.tecnicas.repository;

import unb.tecnicas.carga.CarroCarga;
import unb.tecnicas.carga.ClienteCarga;
import unb.tecnicas.carga.MarcaCarga;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Transacao;

import java.util.ArrayList;
import java.util.List;

public abstract class DatabaseSimulator {

    protected List<Marca> marcaList = MarcaCarga.gerarMarcas();

    protected List<Carro> carroList = CarroCarga.gerarCarros(marcaList);

    protected List<Transacao> transacaoList = new ArrayList<>();

    protected List<Cliente> clienteList = ClienteCarga.gerarClientes();

    protected List<Locadora> locadoraList;

    public void gerarCarga() {
        locadoraList.get(0).setCarroList(carroList);
        locadoraList.get(0).setClienteList(clienteList);
        locadoraList.get(0).setTransacaoList(transacaoList);
        locadoraList.get(0).setMarcaList(marcaList);
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

    public List<Locadora> getLocadoraList() {
        return locadoraList;
    }
}
