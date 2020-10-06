package repository;

public interface Repository<ID, T> {
    void create(T t);
    T read(ID id);
    void update(T t);
    void delete(T t);
}
