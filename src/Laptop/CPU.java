package Laptop;

public class CPU {
    private String brand;
    private String name;
    private int CPUFrequency;
    private int NumberOfCores;

    public CPU(String brand, String name, int CPUFrequency, int numberOfCores) {
        this.brand = brand;
        this.name = name;
        this.CPUFrequency = CPUFrequency;
        NumberOfCores = numberOfCores;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getCPUFrequency() {
        return CPUFrequency;
    }

    public int getNumberOfCores() {
        return NumberOfCores;
    }
}