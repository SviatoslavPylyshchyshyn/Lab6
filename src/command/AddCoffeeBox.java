package command;

import van.*;

import java.util.Scanner;

public class AddCoffeeBox implements Command {
    private final Van van;

    public AddCoffeeBox(Van van) {
        this.van = van;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть тип кави:");
        System.out.println("1. Мелена");
        System.out.println("2. Зернова");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистити буфер після вводу числа

        System.out.print("Введіть ID кави: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Очистити буфер після вводу числа

        System.out.print("Введіть назву кави: ");
        String name = scanner.nextLine();

        System.out.print("Введіть об'єм кави (у літрах): ");
        double volume = scanner.nextDouble();

        System.out.print("Введіть ціну кави: ");
        double price = scanner.nextDouble();

        CoffeeBox coffeeBox;
        if (choice == 1) {
            coffeeBox = new Melena(id, name, volume, price);
        } else if (choice == 2) {
            coffeeBox = new Zernova(id, name, volume, price);
        } else {
            System.out.println("Неправильний вибір. Створюємо стандартний CoffeeBox.");
            coffeeBox = new CoffeeBox(id, name, volume, price);
        }

        van.addCoffeeBox(coffeeBox);
        System.out.println("Новий ящик кави успішно додано до фургона.");
    }
}



