package repository;

import domain.Employee;

public interface EmployeeRepository extends Repository<Long, Employee> {
    Employee findByUserName(String username);
    Employee findByIDNumber(Long idCardNumber);
}
