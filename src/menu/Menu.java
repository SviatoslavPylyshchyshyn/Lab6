package menu;

import command.Command;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<Integer, Command> commands = new LinkedHashMap<>();
    private final Map<Integer, String> descriptions = new LinkedHashMap<>();

    // Додаємо команду разом з описом
    public void addCommand(int index, Command command, String description) {
        commands.put(index, command);
        descriptions.put(index, description);
    }

    // Вивід меню та виконання обраної команди
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Виводимо меню
            System.out.println("\n=== Меню ===");
            for (Map.Entry<Integer, String> entry : descriptions.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }
            System.out.println("0. Повернутися");

            System.out.print("Оберіть опцію: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break; // Вихід з меню
            }

            boolean found = false;
            for (Map.Entry<Integer, Command> entry : commands.entrySet()) {
                if (entry.getKey() == choice) {
                    entry.getValue().execute(); // Виконати команду
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        } while (true);
    }
}

