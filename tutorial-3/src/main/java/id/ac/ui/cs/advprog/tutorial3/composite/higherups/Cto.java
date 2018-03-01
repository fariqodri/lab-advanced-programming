package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class Cto extends Employees {
    public Cto(String name, double salary) {
        this.name = name;
        this.role = "CTO";
        if (salary < 100000) {
            throw new IllegalArgumentException();
        }

        this.salary = salary;

    }

    @Override
    public double getSalary() throws IllegalArgumentException {
        return salary;
    }
}
