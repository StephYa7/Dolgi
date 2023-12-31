package Laptop;

public class GPU {
    private String brand;
    private String name;
    private int memoryFrequency;
    private int memorySize;

    public GPU(String brand, String name, int memoryFrequency, int memorySize) {
        this.brand = brand;
        this.name = name;
        this.memoryFrequency = memoryFrequency;
        this.memorySize = memorySize;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getMemoryFrequency() {
        return memoryFrequency;
    }

    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", memoryFrequency=" + memoryFrequency +
                ", memorySize=" + memorySize +
                '}';
    }
}