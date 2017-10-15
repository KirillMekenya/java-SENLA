package com.company;

public class Main {

    public static void main(String[] args) {

        Firm firm = new Firm();

        Employee developer = new Developer("Kirill", 1000);
        for (int i = 0; i < 5; i++) {
            firm.employees[i] = new Developer("Vasya", 1000);
        }
        Employee director = new Director("Ivan", 15000);
        firm.employees[5] = director;
        for (int i = 6; i < 10; i++) {
            firm.employees[i] = new QAengineer("Kate", 350);
        }


        System.out.print("Total salary is " + firm.getAllSalary());

    }
}
