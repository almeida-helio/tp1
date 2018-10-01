package unb.tecnicas.carga;

import unb.tecnicas.model.Carro;
import unb.tecnicas.model.Marca;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CarroCarga {


    private static String[] modelos = {
            "Limoeiros movel", "Carrocas a Vapor",
            "Dentoes Car", "Canoa a remo", "Onion movel",
            "Fedor Car", "Hamburger Car", "Ovini",
            "Not a Car Car", "Mauricio's Car"
    };

    private static int[] years = {
            1964, 1808, 1822, 1889, 2016,
            1985, 1984, 1988, 2000, 1998,
            1500
    };


    private static final String[] placas = {
            "JJJ 8107", "CEB 9494", "ONI 7070",
            "RUS 7150", "RBR 1985", "DIT 1964",
            "REP 1989", "IND 1822", "FMR 1808",
            "ETN 1937", "ETN 1945", "JUS 1961"
    };

    private static final String[] renavams = {
            "85011896581", "27033729575", "20863605391", "48504884730",
            "23114435803", "40355790644"
    };

    public static List<Carro> gerarCarros(List<Marca> marcas) {
        List<Carro> carroList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            carroList.add(gerarCarro((i + 1), marcas));
        }
        return carroList;
    }

    public static Carro gerarCarro(int i, List<Marca> marcas) {
        Carro carro = new Carro();
        Random r = new Random();
        Year year = Year.of(years[r.nextInt(years.length - 1)]);
        carro.setId(i);
        carro.setModelo(modelos[r.nextInt(modelos.length - 1)]);
        carro.setMarca(marcas.get(r.nextInt(marcas.size() - 1)));
        carro.setPlaca(placas[r.nextInt(placas.length - 1)]);
        carro.setRenavam(renavams[r.nextInt(renavams.length - 1)]);
        carro.setAno(year);
        carro.setNumeroBancos(getModuloFormatado(i));
        carro.setNumeroPortas(getModuloFormatado(i + 1));
        carro.setQuilometrosRodados(r.nextGaussian()*100 + 100);
        carro.setStatusLocacao(DominioStatusLocacao.D);
        return carro;
    }

    private static int getModuloFormatado(int i) {
        if (i % 2 == 0) {
            return 4;
        } else {
            return 2;
        }
    }
}
