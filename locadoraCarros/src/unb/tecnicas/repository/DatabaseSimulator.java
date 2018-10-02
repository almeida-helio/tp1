package unb.tecnicas.repository;

import unb.tecnicas.carga.AgenciaCarga;
import unb.tecnicas.carga.CarroCarga;
import unb.tecnicas.carga.ClienteCarga;
import unb.tecnicas.carga.LocadoraCarga;
import unb.tecnicas.carga.ModeloCarga;
import unb.tecnicas.model.Agencia;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;
import unb.tecnicas.model.Modelo;
import unb.tecnicas.model.Operacao;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulator {


    protected List<Modelo> modeloList = ModeloCarga.gerarModelos();

    protected List<Locadora> locadoraList = LocadoraCarga.gerarLocadora();

    protected List<Agencia> agenciaList = AgenciaCarga.gerarAgencias(locadoraList.get(0));

    protected List<Carro> carroList = CarroCarga.gerarCarros(modeloList, agenciaList);

    protected List<Cliente> clienteList = ClienteCarga.gerarClientes();

    protected List<Operacao> operacaoList = new ArrayList<>();

    public void gerarCarga() {
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public List<Carro> getCarroList() {
        return carroList;
    }


    public List<Locadora> getLocadoraList() {
        return locadoraList;
    }

    public List<Operacao> getOperacaoList() { return operacaoList;}

    public List<Modelo> getModeloList() {
        return modeloList;
    }

    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }
}
