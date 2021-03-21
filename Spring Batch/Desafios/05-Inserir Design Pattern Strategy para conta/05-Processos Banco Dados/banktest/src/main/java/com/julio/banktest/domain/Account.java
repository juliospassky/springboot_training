package com.julio.banktest.domain;

import com.julio.banktest.domain.accounttype.IAccountType;
import com.julio.banktest.domain.accounttype.enumerated.AccountType;
import lombok.Data;

@Data
public class Account {
    Integer id;
    String tipo;
    Long limite;
    Integer cliente_id;
    AccountType accountType;
    IAccountType iAccountType;

    public Account(IAccountType iAccountType) {
        this.iAccountType = iAccountType;
    }
}
