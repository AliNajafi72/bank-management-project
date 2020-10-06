package repository;

import domain.Employee;

import java.util.Optional;

public class EmployeeRepositoryImpel implements EmployeeRepository {
    @Override
    public Employee findByUserName(String username) {
        return null;
    }

    @Override
    public Employee findByIDNumber(Long idCardNumber) {
        return null;
    }

    @Override
    public void create(Employee employee) {

    }

    @Override
    public Optional<Employee> read(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }
}
