package service.login;

import domain.Employee;

import java.util.Optional;

public class EmployeeLogin implements LoginStrategy<Employee> {
    @Override
    public Optional<Employee> verify(String username, String password) {
        return null;
    }
}
