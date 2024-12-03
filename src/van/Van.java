package van;

import java.util.ArrayList;
import java.util.List;

public class Van {
    private List<CoffeeBox> coffeeBoxes;

    public Van() {
        this.coffeeBoxes = new ArrayList<>();
    }

    // Додаємо метод addCoffeeBox, щоб додавати ящики кави
    public void addCoffeeBox(CoffeeBox coffeeBox) {
        coffeeBoxes.add(coffeeBox);
    }

    // І інші методи для роботи з ящиками кави
    public List<CoffeeBox> getCoffeeBoxes() {
        return coffeeBoxes;
    }


    @Override
    public String toString() {
        return "У фургоні " + coffeeBoxes.size() + " ящиків кави.";
    }
}


