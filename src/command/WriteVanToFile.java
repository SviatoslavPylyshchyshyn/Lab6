package command;

import van.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteVanToFile implements Command {
    @Override
    public void execute() {
        Van van = VanService.getVan(); // Отримуємо поточний фургон
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("van_data.txt"))) {
            oos.writeObject(van);
            System.out.println("Фургон був успішно записаний у файл.");
        } catch (IOException e) {
            System.out.println("Помилка при запису фургона в файл: " + e.getMessage());
        }
    }
}
