package com.company;

public class Product implements IProduct{
    String name;
    ProductPart part1;
    ProductPart part2;
    ProductPart part3;
    public Product(String name)
    {
        this.name = name;
    }
    public void installFirstPart(ProductPart part){
        this.part1=part;
        System.out.println("Установка комплектующего "+this.part1.name+" в "+this.name);
    }
    public void installSecondPart(ProductPart part){
        this.part2=part;
        System.out.println("Установка комплектующего "+this.part2.name+" в "+this.name);
    }
    public void installThirdPart(ProductPart part){
        this.part3=part;
        System.out.println("Установка комплектующего "+this.part3.name+" в "+this.name);
    }
}
