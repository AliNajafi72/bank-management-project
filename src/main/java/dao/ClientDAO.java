package dao;
import domain.Client;

import java.util.Optional;

public interface ClientDAO extends DAO<Long, Client> {
    Optional<Client> findByUserName(String username);
    Optional<Client> findByIDNumber(Long idCardNumber);
}
