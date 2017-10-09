package com.company;

public class AssemblyLine implements IAssemblyLine{
    public Product assembleProduct(Product product){
        product.installFirstPart(product.part1);
        product.installSecondPart(product.part2);
        product.installThirdPart(product.part3);
        System.out.println("Сборка продукта " +product.name+" завершена.");
        return product;
    }
}