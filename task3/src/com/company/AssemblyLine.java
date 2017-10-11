package com.company;

public class AssemblyLine implements IAssemblyLine{
    KeyboardStep step1;
    MonitorStep step2;
    MotherBoardStep step3;
    public AssemblyLine(KeyboardStep step1, MonitorStep step2, MotherBoardStep step3)
    {
        this.step1=step1;
        this.step2=step2;
        this.step3=step3;
    }
    public Laptop assembleProduct(Laptop product){
        product.installFirstPart(step1.buildProductPart());
        product.installSecondPart(step2.buildProductPart());
        product.installThirdPart(step3.buildProductPart());
        System.out.println("Сборка продукта " +product.name+" завершена.");
        return product;
    }
}