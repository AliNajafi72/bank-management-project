package repository;

import domain.Client;

public interface ClientRepository extends Repository<Long, Client> {
    Client findByUserName(String username);
    Client findByIDNumber(Long idCardNumber);
}
