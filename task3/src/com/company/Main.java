package com.company;

public class Main {
    public static void main(String[] args) {
       ProductPart part1 = new ProductPart("корпус");
       ProductPart part2 = new ProductPart("материнская плата");
       ProductPart part3 = new ProductPart("монитор");
       LineStep process1 = new LineStep();
       process1.productPart=part1;
       LineStep process2 = new LineStep();
       process2.productPart = part2;
       LineStep process3 = new LineStep();
       process3.productPart = part3;
       AssemblyLine realization = new AssemblyLine(process1, process2, process3);
       Product product = new Product("Ноутбук");
       realization.assembleProduct(product);
    }
}
