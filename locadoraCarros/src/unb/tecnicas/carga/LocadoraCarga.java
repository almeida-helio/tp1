package unb.tecnicas.carga;

import unb.tecnicas.model.Locadora;

import java.util.ArrayList;
import java.util.List;

public final class LocadoraCarga {

    public static List<Locadora> gerarLocadora() {
        List<Locadora> locadoraList = new ArrayList<>();
        Locadora locadora = new Locadora();
        locadora.setId(1);
        locadora.setNome("Limoeiros Car Locadora");
        locadora.setEmail("limoeiros@lemons.com");
        locadora.setCnpj("63155053000100");
        locadora.setRazaoSocial("Mauricio & Souza Producoes");
        locadora.setEndereco("Limoeiros Avenue Nº 4");
        locadora.setPresidente("Monica");
        locadora.setVicePresidente("Cebolinha");
        locadoraList.add(locadora);
        return locadoraList;
    }
}
