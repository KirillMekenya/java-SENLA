package com.company;

public class Main {
    public static void main(String[] args) {
       ProductPart part1 = new ProductPart("корпус");
       ProductPart part2 = new ProductPart("материнская плата");
       ProductPart part3 = new ProductPart("монитор");
       AssemblyLine realization = new AssemblyLine();
       LineStep process1 = new LineStep();
       process1.productPart=part1;
       LineStep process2 = new LineStep();
       process2.productPart = part2;
       LineStep process3 = new LineStep();
       process3.productPart = part3;
       process1.buildProductPart();
       process2.buildProductPart();
       process3.buildProductPart();
       Product product = new Product("Ноутбук");
       product.part1=part1;
       product.part2=part2;
       product.part3=part3;
       realization.assembleProduct(product);
    }
}
