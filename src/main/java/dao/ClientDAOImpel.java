package dao;

import domain.Client;
import util.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class ClientDAOImpel implements ClientDAO {
    EntityManager entityManager;
    @Override
    public Optional<Client> findByUserName(String username) {
        entityManager = EntityManagerFactorySingleton.getEntityManagerFactoryInstance().createEntityManager();
        TypedQuery<Client> namedQuery = entityManager.createNamedQuery("FIND_BY_USERNAME", Client.class);
        namedQuery.setParameter("username", username);
        Optional<Client> clientOptional;
        if (namedQuery.getResultList().size()>0) {
            clientOptional = Optional.ofNullable(namedQuery.getResultList().get(0));
        } else {
            clientOptional = Optional.empty();
        }
        return clientOptional;
    }

    @Override
    public Optional<Client> findByIDNumber(Long idCardNumber) {
        return null;
    }

    @Override
    public void create(Client client) {

    }

    @Override
    public Optional<Client> read(Long aLong) {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }
}
