package van;

public class CoffeeBox {
    private int id;
    private String name;
    private double volume;
    private double price;

    public CoffeeBox(int id, String name, double volume, double price) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    // Гетери
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return volume * price;
    }

    @Override
    public String toString() {
        return "CoffeeBox{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                ", volume=" + volume +
                ", pricePerVolume=" + price +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }

    // Метод для отримання типу
    public String getType() {
        return "Загальний";
    }
}
