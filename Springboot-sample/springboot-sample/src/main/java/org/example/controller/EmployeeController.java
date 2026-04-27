package org.example.controller;


import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    EmployeeController(final EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }


    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee){
        return this.employeeService.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        this.employeeService.delete(id);
        return "Employee Deleted";
    }


}
