package com.company;

public class AssemblyLine implements IAssemblyLine{
    LineStep step1;
    LineStep step2;
    LineStep step3;
    public AssemblyLine(LineStep step1, LineStep step2, LineStep step3)
    {
        this.step1=step1;
        this.step2=step2;
        this.step3=step3;
    }
    public Product assembleProduct(Product product){
        product.installFirstPart(step1.buildProductPart());
        product.installSecondPart(step2.buildProductPart());
        product.installThirdPart(step3.buildProductPart());
        System.out.println("Сборка продукта " +product.name+" завершена.");
        return product;
    }
}