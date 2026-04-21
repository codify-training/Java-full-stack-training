package org.example.springsamples.data_jpa_hibernate;

import org.example.springsamples.data_jpa_hibernate.config.AppConfigDataJPA;
import org.example.springsamples.data_jpa_hibernate.entity.Employee;
import org.example.springsamples.data_jpa_hibernate.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringDataJPAMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigDataJPA.class);
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        /*Employee emp = new Employee();
        emp.setFirstName("Haarish");
        emp.setLastName("Raj");
        emp.setEmail("Haarishtest@gmail.com");
        emp.setPhone("7200123420");
        employeeService.createEmployee(emp);*/

        List<Employee> employees = employeeService.getEmployees();
        System.out.println(employees);

        employeeService.deleteWithFailure(76L);

        System.out.println(employeeService.getEmployees());

    }
}
