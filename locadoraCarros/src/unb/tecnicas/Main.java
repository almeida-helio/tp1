package unb.tecnicas;

import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.view.InitialView;

public class Main {

    public static void main(String[] args) {
        InitialView.fluxoInicial();
        DatabaseSimulator.getClienteList().forEach( c -> c.imprime());
    }
}
