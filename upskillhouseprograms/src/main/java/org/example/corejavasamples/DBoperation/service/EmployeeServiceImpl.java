package org.example.corejavasamples.DBoperation.service;

import org.example.corejavasamples.DBoperation.model.Employee;
import org.example.corejavasamples.DBoperation.dao.EmployeeDAO;
import org.example.corejavasamples.DBoperation.dao.EmployeeDAOImpl;

import java.sql.SQLException;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public void createEmployee(final Employee employee) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.createEmployee(employee);
    }

    @Override
    public void updateEmployee(int id, String email) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.updateEmployee(id, email);
    }

    //Alt + enter
    @Override
    public void deleteEmployee(int id) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public void getAllEmployees() throws SQLException{
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.getAllEmployees();
    }



}
