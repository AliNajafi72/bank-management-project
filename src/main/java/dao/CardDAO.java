package dao;

import domain.Card;

import java.util.Optional;

public interface CardDAO extends DAO<Long, Card> {
    Optional<Card> findByCardNumber(String cardNumber);
}
