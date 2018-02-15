package com.payment.enums;

public enum CardType {
    VISA, MASTER;

    public static CardType getCardType(final String cardType) {
        CardType return_cardtype = null;
        for (CardType type : values()) {
            if (type.toString().equals(cardType)) {
                return_cardtype = type;
            }
        }
        return return_cardtype;
    }
}
