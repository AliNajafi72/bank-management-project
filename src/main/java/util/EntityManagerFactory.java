package util;

import javax.persistence.Persistence;

public class EntityManagerFactory {
    private EntityManagerFactory entityManagerFactory;

    private EntityManagerFactory() {

    }

    public EntityManagerFactory getEntityManagerFactory() {
        if (this.entityManagerFactory == null) {
            javax.persistence.EntityManagerFactory userEntityManagerFactory =
                    Persistence.createEntityManagerFactory("BankSystem");
        }
        return entityManagerFactory;
    }
}
