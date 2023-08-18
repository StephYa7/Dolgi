package Laptop;

public class HDD {
    private String brand;
    private String name;
    private int capacity;

    public HDD(String brand, String name, int capacity) {
        this.brand = brand;
        this.name = name;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}