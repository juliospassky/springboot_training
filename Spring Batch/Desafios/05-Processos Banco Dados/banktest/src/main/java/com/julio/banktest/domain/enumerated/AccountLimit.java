package com.julio.banktest.domain.enumerated;

public enum AccountLimit {
    PRATA(500L),
    OURO(1000L),
    PLATINA(2500L),
    DIAMANTE(5000L);

    private final Long value;

    private AccountLimit(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

}
