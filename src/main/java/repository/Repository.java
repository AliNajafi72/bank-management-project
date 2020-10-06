package repository;

import java.util.Optional;

public interface Repository<ID, T> {
    void create(T t);
    Optional<T> read(ID id);
    void update(T t);
    void delete(T t);
}
