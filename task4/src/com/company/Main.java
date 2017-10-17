package com.company;

public class Main {

    public static void main(String[] args) {
	Operator operator = new Operator();
	operator.addFlight(1);
	operator.addFlight(2);
	operator.addFlight(3);
	operator.addPassager(1, "Kirill");
	operator.addPassager(1, "Sasha");
	operator.addPassager(1,"Vitya");
	operator.changeStatusFlight(2,"Decline");
	operator.changeStatusFlight(3, "Late");
	operator.printInfo();
	operator.removePassager(1, "Kirill");
	operator.printInfo();
    }
}
