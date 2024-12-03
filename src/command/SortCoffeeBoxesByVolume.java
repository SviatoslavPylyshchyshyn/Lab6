package command;

import van.*;
import java.util.Comparator;

public class SortCoffeeBoxesByVolume implements Command {
    @Override
    public void execute() {
        Van van = VanService.getVan();
        if (van.getCoffeeBoxes().isEmpty()) {
            System.out.println("Фургон порожній. Немає ящиків кави.");
            return;
        }

        // Сортуємо ящики кави за об'ємом
        van.getCoffeeBoxes().sort(Comparator.comparingDouble(CoffeeBox::getVolume));
        System.out.println("Ящики кави відсортовані за об'ємом:");
        for (CoffeeBox box : van.getCoffeeBoxes()) {
            System.out.println(box);
        }
    }
}
