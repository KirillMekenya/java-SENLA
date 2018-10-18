package com.company;

public class Firm {
    Employee[] employees = new Employee[10];
    int allSalary;

    public int getAllSalary() {
        for (int i = 0; i < this.employees.length; i++) {
            this.allSalary = this.allSalary + this.employees[i].salary;
        }
        return allSalary;
    }

    public void collationFirm() {
        for (int i = 0; i < 5; i++) {
            this.employees[i] = new Developer("Vasya", 1000);
        }
        Employee director = new Director("Ivan", 15000);
        this.employees[5] = director;
        for (int i = 6; i < 10; i++) {
            this.employees[i] = new QAengineer("Kate", 350);
        }
    }

}
