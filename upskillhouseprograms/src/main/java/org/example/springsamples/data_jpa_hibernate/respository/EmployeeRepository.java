package org.example.springsamples.data_jpa_hibernate.respository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.springsamples.data_jpa_hibernate.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

///This class is equal to DAO class
@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Employee emp){
        entityManager.persist(emp);
    }

    public Employee findById(Long id){
        return entityManager.find(Employee.class, id);
    }

    public List<Employee> getEmployees(){
        return entityManager.createQuery(" From Employee", Employee.class).getResultList();
    }

    @Transactional
    public void delete(long id){
        Employee employee = findById(id);
        if(employee != null){
            entityManager.remove(employee);
        }
    }

    @Transactional
    public void deleteWithFailure(long id){
        Employee employee = findById(id);
        if(employee != null){
            entityManager.remove(employee);
           // throw new RuntimeException();
        }
    }

}
