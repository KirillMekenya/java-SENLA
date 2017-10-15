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
}
