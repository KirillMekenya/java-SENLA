package com.company;

public class KeyboardStep implements ILineStep{
    Keyboard keyboard ;

    public Keyboard buildProductPart(){
        System.out.println("Изготовление комлектующего "+keyboard.name);
        return keyboard;
    }

}
