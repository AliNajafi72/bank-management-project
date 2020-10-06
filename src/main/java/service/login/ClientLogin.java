package service.login;

import domain.Client;
import repository.ClientRepositoryImpel;
import java.util.Optional;

public class ClientLogin implements LoginStrategy<Client> {
    ClientRepositoryImpel clientRepositoryImpel;
    @Override
    public Optional<Client> verify(String username, String password) {
        clientRepositoryImpel = new ClientRepositoryImpel();
        Optional<Client> clientOptional = clientRepositoryImpel.findByUserName(username);
        if (clientOptional.isPresent() && clientOptional.get().getPassword().equals(password)) {
            System.out.println("Right!");
            return clientOptional;
        } else {
            System.out.println("Wrong!");
            return Optional.empty();
        }
    }
}
