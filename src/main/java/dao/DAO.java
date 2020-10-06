package dao;

import java.util.Optional;

public interface DAO<ID,T> {
    void create(T t);
    Optional<T> read(ID id);
    void update(T t);
    void delete(T t);
}
