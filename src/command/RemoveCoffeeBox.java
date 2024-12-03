package command;

import van.*;
import java.util.Scanner;

public class RemoveCoffeeBox implements Command {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Van van = VanService.getVan(); // Отримуємо фургон
        if (van.getCoffeeBoxes().isEmpty()) {
            System.out.println("Фургон порожній. Немає ящиків кави.");
            return;
        }

        // Запитуємо ID ящика для видалення
        System.out.print("Введіть ID ящика для видалення: ");
        int id = scanner.nextInt();

        CoffeeBox boxToRemove = null;
        for (CoffeeBox box : van.getCoffeeBoxes()) {
            if (box.getId() == id) {
                boxToRemove = box;
                break;
            }
        }

        if (boxToRemove != null) {
            van.getCoffeeBoxes().remove(boxToRemove); // Видаляємо ящик
            System.out.println("Ящик кави з ID " + id + " був видалений.");
        } else {
            System.out.println("Ящик з таким ID не знайдений.");
        }
    }
}


