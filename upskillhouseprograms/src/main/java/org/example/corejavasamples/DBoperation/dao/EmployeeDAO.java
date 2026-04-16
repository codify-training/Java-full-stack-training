package org.example.corejavasamples.DBoperation.dao;

import org.example.corejavasamples.DBoperation.model.Employee;

import java.sql.SQLException;

public interface EmployeeDAO {
    void createEmployee(Employee employee) throws SQLException;

    void updateEmployee(int id, String email) throws SQLException;

    void deleteEmployee(int id) throws SQLException;

    void getAllEmployees() throws SQLException;
}
