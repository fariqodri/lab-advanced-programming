package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class Ceo extends Employees {
    public Ceo(String name, double salary) {
        //TODO Implement
        this.name = name;
        this.role = "CEO";
        if (salary < 200000) {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
    }

    @Override
    public double getSalary() throws IllegalArgumentException {
        //TODO Implement
        return this.salary;
    }
}
