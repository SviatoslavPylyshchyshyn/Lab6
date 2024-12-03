package van;

public class Melena extends CoffeeBox {
    public Melena(int id, String name, double volume, double price) {
        super(id, name, volume, price);
    }

    @Override
    public String getType() {
        return "Мелена";
    }
}

