package dao;

import domain.Account;

import java.util.Optional;

public interface AccountDAO extends DAO<Long, Account> {
    Optional<Account> findByAccountNumber(Long accountNumber);
}
