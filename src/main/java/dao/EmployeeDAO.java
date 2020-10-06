package dao;

import domain.Employee;

import java.util.Optional;

public interface EmployeeDAO extends DAO<Long, Employee> {
    Optional<Employee> findByUserName(String username);
    Optional<Employee> findByIDNumber(Long idCardNumber);
}
