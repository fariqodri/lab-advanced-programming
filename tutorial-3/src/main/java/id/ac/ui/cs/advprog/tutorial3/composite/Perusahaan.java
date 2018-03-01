package id.ac.ui.cs.advprog.tutorial3.composite;

import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Ceo;
import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Cto;
import id.ac.ui.cs.advprog.tutorial3.composite.techexpert.*;

public class Perusahaan {
    public static void main(String[] args) {
        BackendProgrammer backendProgrammer = new BackendProgrammer("Joni", 5000000);
        FrontendProgrammer frontendProgrammer = new FrontendProgrammer("Cody", 4000000);
        Ceo ceo = new Ceo("Bills", 500000000);
        Cto cto = new Cto("Steven", 100000000);
        NetworkExpert networkExpert = new NetworkExpert("Ben", 3000000);
        SecurityExpert securityExpert = new SecurityExpert("Fahmi", 500000);
        UiUxDesigner uiUxDesigner = new UiUxDesigner("Pras", 700000);
        Company company = new Company();
        company.addEmployee(backendProgrammer);
        company.addEmployee(frontendProgrammer);
        company.addEmployee(ceo);
        company.addEmployee(cto);
        company.addEmployee(networkExpert);
        company.addEmployee(securityExpert);
        company.addEmployee(uiUxDesigner);
        for(Employees employee : company.getAllEmployees()) {
            System.out.println(employee.getRole() + " : " + employee.getName() + ", Salary: " + employee.getSalary());
        }

    }
}
