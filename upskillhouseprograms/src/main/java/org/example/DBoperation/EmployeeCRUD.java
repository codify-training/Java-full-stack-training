package org.example.DBoperation;

import java.sql.*;

public class EmployeeCRUD {

    //by default 5432
    private static final String URL = "jdbc:postgresql://localhost:5433/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void createEmployee(String firstName, String lastName, String email, String phone) throws SQLException {
        try{
            String sql = "insert into employee(first_name, last_name, email, phone) values(?, ?, ?, ?)";
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.execute();
            System.out.println("Record added succesfullly ");
        }catch (Exception ex){

        }
    }

    public static void updateEmployee(int id, String email) throws SQLException {
        String sql = "update employee set email = ? where emp_id = ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setInt(2, id);
        int updatedRowCount = preparedStatement.executeUpdate();
        System.out.println("Update Successfull : Rows Count : "+ updatedRowCount);
    }

    public static void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where emp_id = ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int deletedRowCount = preparedStatement.executeUpdate();
        System.out.println("Delete Successfull : Rows Count : "+ deletedRowCount);
    }

    public static void getAllEmployees() throws SQLException {
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


    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        System.out.println("Connection established Successfully");

        createEmployee("Ramesh", "Chow", "ramesh@gmail.com", "7200125429");
        //updateEmployee(67, "Maggu@gmail.com");
        //deleteEmployee(67);
        getAllEmployees();

    }

}
