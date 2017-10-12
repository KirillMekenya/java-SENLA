package com.company;

public class KeyboardStep implements ILineStep{
    Keyboard keyboard ;

    public Keyboard buildProductPart(){
        System.out.println("Created accessory "+keyboard.name);
        return keyboard;
    }

}
