package repository;

import domain.Card;

import java.util.Optional;

public class CardRepositoryImpel implements CardRepository {
    @Override
    public Card findByCardNumber(String cardNumber) {
        return null;
    }

    @Override
    public void create(Card card) {

    }

    @Override
    public Optional<Card> read(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void update(Card card) {

    }

    @Override
    public void delete(Card card) {

    }
}
