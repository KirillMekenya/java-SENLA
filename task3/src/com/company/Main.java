package com.company;

public class Main {
    public static void main(String[] args) {
       Keyboard part1 = new Keyboard("Keyboard");
       Monitor part2 = new Monitor("Monitor");
       MotherBoard part3 = new MotherBoard("Motherboard");
       KeyboardStep process1 = new KeyboardStep();
       process1.keyboard=part1;
       MonitorStep process2 = new MonitorStep();
       process2.monitor = part2;
       MotherBoardStep process3 = new MotherBoardStep();
       process3.motherBoard = part3;
       AssemblyLine realization = new AssemblyLine(process1, process2, process3);
       realization.assembleProduct(new Laptop("Laptop"));
    }
}
