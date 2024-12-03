package command;

import van.*;
import java.util.Comparator;

public class SortCoffeeBoxesByPrice implements Command {
    @Override
    public void execute() {
        Van van = VanService.getVan();
        if (van.getCoffeeBoxes().isEmpty()) {
            System.out.println("Фургон порожній. Немає ящиків кави.");
            return;
        }

        // Сортуємо ящики кави за ціною
        van.getCoffeeBoxes().sort(Comparator.comparingDouble(CoffeeBox::getPrice));
        System.out.println("Ящики кави відсортовані за ціною:");
        for (CoffeeBox box : van.getCoffeeBoxes()) {
            System.out.println(box);
        }
    }
}
