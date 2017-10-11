package com.company;

public class MonitorStep implements ILineStep{
    Monitor monitor ;

    public Monitor buildProductPart(){
        System.out.println("Изготовление комлектующего "+monitor.name);
        return monitor;
    }

}
