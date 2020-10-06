package service.login;

import java.util.Optional;

public interface LoginStrategy<T> {
    Optional<T> verify(String username, String password);
}
