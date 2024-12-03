package main;

import menu.Menu;
import van.VanService;
import file.FileService;

public class Main {

    private static final Menu mainMenu = new Menu();

    static {
        mainMenu.addCommand(1, () -> VanService.displayVanMenu(), "Дії з фургоном");
        mainMenu.addCommand(2, () -> FileService.displayFileMenu(), "Дії з файлом");
        mainMenu.addCommand(3, null, "Вихід");
    }

    public static void main(String[] args) {
        mainMenu.display();
    }
}

