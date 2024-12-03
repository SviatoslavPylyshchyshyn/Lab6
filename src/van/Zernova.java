package van;

public class Zernova extends CoffeeBox {
    public Zernova(int id, String name, double volume, double price) {
        super(id, name, volume, price);
    }

    @Override
    public String getType() {
        return "Зернова";
    }
}

