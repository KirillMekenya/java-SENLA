package com.company;

public class MotherBoardStep implements ILineStep{
    MotherBoard motherBoard ;

    public MotherBoard buildProductPart(){
        System.out.println("Изготовление комлектующего "+motherBoard.name);
        return motherBoard;
    }

}
