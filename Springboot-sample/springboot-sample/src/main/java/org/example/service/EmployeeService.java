package org.example.service;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    EmployeeService(EmployeeRepository repo){
        this.repo = repo;
    }

    public Employee save(Employee employee){
        return this.repo.save(employee);
    }

    public List<Employee> findAll(){
        return this.repo.findAll();
    }

    public Employee findById(Long id){
        return this.findById(id);
    }

    public Employee update(Long id, Employee employee){
        Employee oldEmp = this.repo.findById(id).orElse(null);
        if(oldEmp != null){
            oldEmp.setFirstName(employee.getFirstName());
            oldEmp.setLastName(employee.getLastName());
            oldEmp.setPhone(employee.getPhone());
            oldEmp.setEmail(employee.getEmail());
            return this.repo.save(oldEmp);
        }
        return null;
    }


    @Transactional
    public Employee trxDemo(Long id, Employee employee){
        Employee oldEmp = this.repo.findById(id).orElse(null);
        if(oldEmp != null){
            oldEmp.setFirstName(employee.getFirstName());
            oldEmp.setLastName(employee.getLastName());
            oldEmp.setPhone(employee.getPhone());
            oldEmp.setEmail(employee.getEmail());
            Employee emp = this.repo.save(oldEmp);
            if(emp != null ){
                throw new IllegalArgumentException("Error updating employee during trx.");
            }
        }
        return null;
    }

    public void delete(Long id){
        this.repo.deleteById(id);
    }


    public void testRestAPI(){
        String response = WebClient.builder().build()
                .get()
                .uri("https://jsonplaceholder.typicode.com/users")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("WE got rewsponse from server :::: "+ response);
    }

}
