package repository;

import domain.Client;

import java.util.Optional;

public interface ClientRepository extends Repository<Long, Client> {
    Optional<Client> findByUserName(String username);
    Optional<Client> findByIDNumber(Long idCardNumber);
}
