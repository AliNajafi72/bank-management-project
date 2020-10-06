package dao;

import domain.Client;
import domain.Employee;

public interface EmployeeDAO extends DAO<Long, Employee> {
    Employee findByUserName(String username);
    Employee findByIDNumber(Long idCardNumber);
}
