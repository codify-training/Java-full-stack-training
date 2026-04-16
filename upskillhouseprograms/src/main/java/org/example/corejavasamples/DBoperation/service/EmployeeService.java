package org.example.corejavasamples.DBoperation.service;

import org.example.corejavasamples.DBoperation.model.Employee;

import java.sql.SQLException;

public interface EmployeeService {
    void createEmployee(Employee employee) throws SQLException;

    void updateEmployee(int id, String email) throws SQLException;

    void deleteEmployee(int id) throws SQLException;

    void getAllEmployees() throws SQLException;
}
