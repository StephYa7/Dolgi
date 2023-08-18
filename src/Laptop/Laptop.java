package Laptop;

public class Laptop {
    private String brand;
    private String name;
    private CPU cpu;
    private GPU gpu;
    private HDD hhd;
    private RAM ram;

    public Laptop(String brand, String name, CPU cpu, GPU gpu, HDD hhd, RAM ram) {
        this.brand = brand;
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.hhd = hhd;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public HDD getHhd() {
        return hhd;
    }

    public void setHhd(HDD hhd) {
        this.hhd = hhd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", hhd=" + hhd +
                ", ram=" + ram +
                '}';
    }
}