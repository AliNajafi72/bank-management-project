package repository;

import domain.Account;

import java.util.Optional;

public class AccountRepositoryImpel implements AccountRepository {
    @Override
    public Account findByAccountNumber(Long accountNumber) {
        return null;
    }

    @Override
    public void create(Account account) {

    }

    @Override
    public Optional<Account> read(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(Account account) {

    }
}
