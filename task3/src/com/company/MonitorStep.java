package com.company;

public class MonitorStep implements ILineStep{
    Monitor monitor ;

    public Monitor buildProductPart(){
        System.out.println("Created accessory "+monitor.name);
        return monitor;
    }

}
