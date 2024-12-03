package command;

import van.VanService;
import van.Van;
import van.CoffeeBox;

public class ShowCoffeeBox implements Command {
    @Override
    public void execute() {
        Van van = VanService.getVan(); // Отримуємо фургон
        if (van.getCoffeeBoxes().isEmpty()) {
            System.out.println("Фургон порожній. Немає ящиків кави.");
        } else {
            System.out.println("Список ящиків кави:");
            for (CoffeeBox box : van.getCoffeeBoxes()) {
                System.out.println(box);
            }
        }
    }
}
