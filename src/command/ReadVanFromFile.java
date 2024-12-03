package command;

import van.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadVanFromFile implements Command {
    @Override
    public void execute() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("van_data.txt"))) {
            Van van = (Van) ois.readObject();
            System.out.println("Фургон був успішно зчитаний з файлу.");
            System.out.println(van);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Помилка при зчитуванні фургона з файлу: " + e.getMessage());
        }
    }
}

