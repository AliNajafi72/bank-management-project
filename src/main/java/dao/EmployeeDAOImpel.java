package dao;

import domain.Employee;

import java.util.Optional;

public class EmployeeDAOImpel implements EmployeeDAO {
    @Override
    public Optional<Employee> findByUserName(String username) {
        return null;
    }

    @Override
    public Optional<Employee> findByIDNumber(Long idCardNumber) {
        return null;
    }

    @Override
    public void create(Employee employee) {

    }

    @Override
    public Optional<Employee> read(Long aLong) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }
}
