package com.company;

public class LineStep implements ILineStep{
    ProductPart productPart;

    public ProductPart buildProductPart(){
        System.out.println("Изготовление комлектующего "+productPart.name);
        return productPart;
    }

}
