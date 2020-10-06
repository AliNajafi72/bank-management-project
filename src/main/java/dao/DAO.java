package dao;

public interface DAO<ID,T> {
    void create(T t);
    T read(ID id);
    void update(T t);
    void delete(T t);
}
