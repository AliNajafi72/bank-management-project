package dao;
import domain.Client;

public interface ClientDAO extends DAO<Long, Client> {
    Client findByUserName(String username);
    Client findByIDNumber(Long idCardNumber);
}
