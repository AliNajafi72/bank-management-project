package repository;

import domain.Account;

public interface AccountRepository extends Repository<Long, Account> {
    Account findByAccountNumber(Long accountNumber);
}
