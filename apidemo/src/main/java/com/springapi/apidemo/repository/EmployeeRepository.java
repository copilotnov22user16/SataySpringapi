package com.springapi.apidemo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.springapi.apidemo.Model.Employee;

@Repository
public class EmployeeRepository {

    static List<Employee> employees = List.of(
            new Employee(1, "Mariam", "Software Engineer", 2000000.00),
            new Employee(2, "Alex", "Software Engineer", 2000000.00),
            new Employee(3, "Sophia", "Senior Software Engineer", 2000000.00));

    public List<Employee> getEmployees() {
        return employees;
    }
}
