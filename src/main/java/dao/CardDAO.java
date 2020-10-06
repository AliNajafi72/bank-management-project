package dao;

import domain.Card;

public interface CardDAO extends DAO<Long, Card> {
    Card findByCardNumber(String cardNumber);
}
