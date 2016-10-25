/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeelist;

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
    }

    public EmployeeDirectory() {
        employeelist = new ArrayList<Employee>();
    }

    public Employee addEmployee() {
        Employee e = new Employee();
        employeelist.add(e);
        return e;
    }

    public void deleteEmployee(Employee e) {
        employeelist.remove(e);
    }

}
