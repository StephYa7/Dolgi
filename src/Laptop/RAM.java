package Laptop;

public class RAM {
    private String brand;
    private String name;
    private int memoryFrequency;
    private int memorySize;

    public RAM(String brand, String name, int memoryFrequency, int memorySize) {
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
}