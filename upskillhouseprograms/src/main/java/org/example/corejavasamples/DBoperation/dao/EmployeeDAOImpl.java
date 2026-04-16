package org.example.corejavasamples.DBoperation.dao;

import org.example.corejavasamples.DBoperation.model.Employee;

import java.sql.*;

import static org.example.corejavasamples.DBoperation.util.DbConnection.getConnection;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void createEmployee(final Employee employee) throws SQLException {
        try{
            String sql = "insert into employee(first_name, last_name, email, phone) values(?, ?, ?, ?)";
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getPhone());
            preparedStatement.execute();
            System.out.println("Record added succesfullly ");
        }catch (Exception ex){

        }
    }

    @Override
    public void updateEmployee(int id, String email) throws SQLException {
        String sql = "update employee set email = ? where emp_id = ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setInt(2, id);
        int updatedRowCount = preparedStatement.executeUpdate();
        System.out.println("Update Successfull : Rows Count : "+ updatedRowCount);
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where emp_id = ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int deletedRowCount = preparedStatement.executeUpdate();
        System.out.println("Delete Successfull : Rows Count : "+ deletedRowCount);
    }

    @Override
    public void getAllEmployees() throws SQLException {
        String sql = "select * from employee";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("Employee List::: ");
        while(resultSet.next()){
            System.out.println( resultSet.getInt("emp_id") +"  | "
                    + resultSet.getString("last_name") + " | "
                    + resultSet.getString("first_name") + " | "
                    + resultSet.getString("email") + " | "
                    + resultSet.getString("phone") + " | "
            );
        }
    }

}
