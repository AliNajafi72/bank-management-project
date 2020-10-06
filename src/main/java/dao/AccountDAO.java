package dao;

import domain.Account;
import domain.Employee;

public interface AccountDAO extends DAO<Long, Account> {
    Account findByAccountNumber(Long accountNumber);
}
