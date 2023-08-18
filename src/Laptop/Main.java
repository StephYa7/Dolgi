package Laptop;

public class Main {
    public static void main(String[] args) {
        CPU cpu1 = new CPU("Intel", "I1", 4000, 2);
        CPU cpu2 = new CPU("Intel", "I5", 3500, 6);
        CPU cpu3 = new CPU("Intel", "I3", 3000, 4);
        CPU cpu4 = new CPU("AMD", "B2", 3800, 3);
        CPU cpu5 = new CPU("AMD", "B4", 3300, 5);
        GPU gpu1 = new GPU("NVIDIA", "A1", 4350, 6000);
        GPU gpu2 = new GPU("NVIDIA", "A2", 3000, 4000);
        GPU gpu3 = new GPU("NVIDIA", "A3", 4500, 5000);
        GPU gpu4 = new GPU("NVIDIA", "A4", 3333, 3000);
        GPU gpu5 = new GPU("NVIDIA", "A4", 2555, 2000);
        RAM ram1 = new RAM("aa","ba",3000,3000);
        RAM ram2 = new RAM("aa","bb",4500,4500);
        RAM ram3 = new RAM("aa","bc",3500,3500);
        RAM ram4 = new RAM("aa","bd",2500,2500);
        RAM ram5 = new RAM("aa","be",5000,5000);
        HDD hdd1 = new HDD("bb","ab",250000);
        HDD hdd2 = new HDD("bb","ac",240000);
        HDD hdd3 = new HDD("bb","ad",230000);
        HDD hdd4 = new HDD("bb","ae",220000);
        HDD hdd5 = new HDD("bb","af",210000);
        Laptop laptop1 = new Laptop("a1","aa",cpu1,gpu1,hdd1,ram1);
        Laptop laptop2 = new Laptop("a2","ab",cpu2,gpu2,hdd2,ram2);
        Laptop laptop3 = new Laptop("a3","ac",cpu3,gpu3,hdd3,ram3);
        Laptop laptop4 = new Laptop("a4","ad",cpu4,gpu4,hdd4,ram4);
        Laptop laptop5 = new Laptop("a5","ae",cpu5,gpu5,hdd5,ram5);











    }
}