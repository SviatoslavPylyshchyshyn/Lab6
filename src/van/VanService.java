package van;

import command.*;
import menu.Menu;

public class VanService {
    private static final Van van = new Van();
    private static final Menu vanMenu = new Menu(); // Використовуємо новий клас Menu

    static {
        vanMenu.addCommand(1, new ShowCoffeeBox(), "Показати список ящиків кави");
        vanMenu.addCommand(2, new AddCoffeeBox(van), "Додати новий ящик кави");
        vanMenu.addCommand(3, new RemoveCoffeeBox(), "Прибрати ящик кави");
        vanMenu.addCommand(4, new SortCoffeeBoxesByPrice(), "Відсортувати ящики кави за ціною");
        vanMenu.addCommand(5, new SortCoffeeBoxesByVolume(), "Відсортувати ящики кави за об'ємом");
    }

    public static Van getVan() {
        return van;
    }

    public static void displayVanMenu() {
        vanMenu.display();
    }
}
