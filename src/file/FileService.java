package file;

import command.*;
import menu.Menu;

public class FileService {

    private static final Menu fileMenu = new Menu();

    static {
        fileMenu.addCommand(1, new WriteVanToFile(), "Записати фургон у файл");
        fileMenu.addCommand(2, new ReadVanFromFile(), "Зчитати фургон з файлу");
        fileMenu.addCommand(3, null, "Повернутися до головного меню");
    }

    public static void displayFileMenu() {
        fileMenu.display();
    }
}
