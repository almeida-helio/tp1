package unb.tecnicas;

import unb.tecnicas.repository.DatabaseSimulator;
import unb.tecnicas.view.menu.InicialMenu;

public class Main {

    public static void main(String[] args) {
        DatabaseSimulator databaseSimulator = new DatabaseSimulator();
        InicialMenu inicialMenu = new InicialMenu(databaseSimulator);
        inicialMenu.menu();
    }
}
