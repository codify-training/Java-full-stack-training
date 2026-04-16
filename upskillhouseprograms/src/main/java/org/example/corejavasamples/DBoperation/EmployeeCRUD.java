package org.example.corejavasamples.DBoperation;

import org.example.corejavasamples.DBoperation.model.Employee;
import org.example.corejavasamples.DBoperation.service.EmployeeService;
import org.example.corejavasamples.DBoperation.service.EmployeeServiceImpl;
import org.example.corejavasamples.DBoperation.util.DbConnection;

import java.sql.*;

public class EmployeeCRUD {

    //by default 5432
    public static void main(String[] args) throws SQLException {

        DbConnection.getConnection();
        System.out.println("connection Success");

     /*   System.out.println("Connection established Successfully");
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Chow");
        employee.setEmail("ramesh1Chow@gmail.com");
        employee.setPhone("7200125429");

        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.createEmployee(employee);
        employeeService.updateEmployee(71, "Maggu@gmail.com");
        employeeService.deleteEmployee(70);
        employeeService.getAllEmployees();*/

    }

}
