package unb.tecnicas.carga;

import unb.tecnicas.model.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ModeloCarga {

    private static final String[] nome = { "Limoeiros", "Goiabas", "Cheiro Nao Agradavel",
            "Gulosos", "Dentucos", "Onions", "Tupiniquins", "Cientist",
            "Rusticos e Sistematicos", "Frufru Enterprise"};

    private static final String[] caracteristica = { "Azedos", "Suculentos", "Fedorentos",
            "Gordos", "Bullyng", "Chorosos", "Nativos", "Espertos", "Da roca", "Frescos"};

    public static List<Modelo> gerarModelos() {
        List<Modelo> modeloList = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            modeloList.add(gerarModelo(i + 1));
        }
        return modeloList;
    }

    public static Modelo gerarModelo(int id) {
        Random r = new Random();
        Random c = new Random();
        Modelo modelo = new Modelo();
        modelo.setId(id);
        modelo.setNome(nome[r.nextInt(nome.length - 1)] +
                " " + caracteristica[c.nextInt(caracteristica.length - 1)]);
        return modelo;
    }
}
