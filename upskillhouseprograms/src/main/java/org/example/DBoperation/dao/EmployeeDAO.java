package org.example.DBoperation.dao;

import org.example.DBoperation.model.Employee;

import java.sql.SQLException;

public interface EmployeeDAO {
    void createEmployee(Employee employee) throws SQLException;

    void updateEmployee(int id, String email) throws SQLException;

    void deleteEmployee(int id) throws SQLException;

    void getAllEmployees() throws SQLException;
}
