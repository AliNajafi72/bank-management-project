package repository;

import dao.ClientDAOImpel;
import domain.Client;

import java.util.Optional;

public class ClientRepositoryImpel implements ClientRepository {

    @Override
    public Optional<Client> findByUserName(String username) {

        return new ClientDAOImpel().findByUserName(username);
    }

    @Override
    public Optional<Client> findByIDNumber(Long idCardNumber) {
        return Optional.empty();
    }

    @Override
    public void create(Client client) {

    }

    @Override
    public Optional<Client> read(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }
}
