package org.example.DBoperation;

import org.example.DBoperation.model.Employee;
import org.example.DBoperation.service.EmployeeService;
import org.example.DBoperation.service.EmployeeServiceImpl;
import org.example.DBoperation.util.DbConnection;

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
