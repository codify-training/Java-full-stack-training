package org.example.springsamples.data_jpa_hibernate.service;

import org.example.springsamples.data_jpa_hibernate.entity.Employee;
import org.example.springsamples.data_jpa_hibernate.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void createEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    public Employee getEmployee(Long id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getEmployees(){
        return employeeRepository.getEmployees();
    }


    public void delete(Long id ){
        employeeRepository.delete(id);
    }

    public void deleteWithFailure(Long id ){
        employeeRepository.deleteWithFailure(id);
    }
}
