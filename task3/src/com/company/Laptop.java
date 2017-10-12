package com.company;

public class Laptop implements IProduct{
    String name;
    Keyboard part1;
    Monitor part2;
    MotherBoard part3;
    public Laptop(String name)
    {
        this.name = name;
    }
    public void installFirstPart(Keyboard part){
        this.part1=part;
        System.out.println("Install accessory "+this.part1.name+" in "+this.name);
    }
    public void installSecondPart(Monitor part){
        this.part2=part;
        System.out.println("Install accessory "+this.part2.name+" in "+this.name);
    }
    public void installThirdPart(MotherBoard part){
        this.part3=part;
        System.out.println("Install accessory "+this.part3.name+" in "+this.name);
    }
}
