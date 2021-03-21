package com.julio.banktest.domain.accounttype;

import com.julio.banktest.domain.Account;
import com.julio.banktest.domain.Client;
import com.julio.banktest.domain.accounttype.enumerated.AccountType;

public class Ouro implements IAccountType {

    @Override
    public void typeAccount(Client client, Account account) {
        if (client.getFaixa_salarial() > 3000 && client.getFaixa_salarial() < 5001)
            account.setAccountType(AccountType.OURO);
    }
}
