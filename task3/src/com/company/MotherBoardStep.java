package com.company;

public class MotherBoardStep implements ILineStep{
    MotherBoard motherBoard ;

    public MotherBoard buildProductPart(){
        System.out.println("Created accessory "+motherBoard.name);
        return motherBoard;
    }

}
