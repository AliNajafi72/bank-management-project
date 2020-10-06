package repository;

import domain.Card;

public interface CardRepository extends Repository<Long, Card> {
    Card findByCardNumber(String cardNumber);
}
