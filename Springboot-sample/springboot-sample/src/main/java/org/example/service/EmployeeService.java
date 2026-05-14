package org.example.service;

import org.example.model.Employee;
import org.example.model.User;
import org.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee employee) {
        return this.repo.save(employee);
    }

    public List<Employee> findAll() {
        return this.repo.findAll();
    }

    // find all the list of employees and filter the list with phone number
    // starting with 72 and return the filtered list
    public List<Employee> findEmployeesByPhonePrefix(String prefix) {
        return this.repo.findAll().stream()
                .filter(emp -> emp.getPhone() != null && emp.getPhone().startsWith(prefix))
                .toList();
    }

    public Employee findById(Long id) {
        return this.repo.findById(id).orElse(null);
    }

    public Employee update(Long id, Employee employee) {
        if (id == null) {
            return null;
        }

        var oldEmp = this.repo.findById(id).orElse(null);
        if (oldEmp instanceof Employee existingEmp) {
            existingEmp.setFirstName(employee.getFirstName());
            existingEmp.setLastName(employee.getLastName());
            existingEmp.setPhone(employee.getPhone());
            existingEmp.setEmail(employee.getEmail());
            return this.repo.save(existingEmp);
        }
        return null;
    }

    @Transactional
    public Employee trxDemo(Long id, Employee employee) {
        var oldEmp = this.repo.findById(id).orElse(null);
        if (oldEmp instanceof Employee existingEmp) {
            existingEmp.setFirstName(employee.getFirstName());
            existingEmp.setLastName(employee.getLastName());
            existingEmp.setPhone(employee.getPhone());
            existingEmp.setEmail(employee.getEmail());
            var emp = this.repo.save(existingEmp);
            if (emp != null) {
                throw new IllegalArgumentException("Error updating employee during trx.");
            }
        }
        return null;
    }

    public void delete(Long id) {
        this.repo.deleteById(id);
    }

    public User testRestAPI(Long id) {
        return WebClient.builder().build()
                .get()
                .uri("""
                        https://jsonplaceholder.typicode.com/users/%s
                        """.formatted(id))
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }

}
