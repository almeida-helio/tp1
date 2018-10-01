package unb.tecnicas.carga;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class MarcaCarga {

    private static final String[] nome = { "Limoeiros", "Goiabas", "Cheiro Nao Agradavel",
            "Gulosos", "Dentucos", "Onions", "Tupiniquins", "Cientist",
            "Rusticos e Sistematicos", "Frufru Enterprise"};

    private static final String[] caracteristica = { "Azedos", "Suculentos", "Fedorentos",
            "Gordos", "Bullyng", "Chorosos", "Nativos", "Espertos", "Da roca", "Frescos"};

    public static List<Marca> gerarMarcas() {
        List<Marca> marcaList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            marcaList.add(gerarMarca(i + 1));
        }
        return marcaList;
    }

    public static Marca gerarMarca(int id) {
        Random r = new Random();
        Random c = new Random();
        Marca marca = new Marca();
        marca.setId(id);
        marca.setNome(nome[r.nextInt(nome.length - 1)] +
                " " + caracteristica[c.nextInt(caracteristica.length - 1)]);
        return marca;
    }
}
