package com.julio.banktest.domain.accounttype;

import com.julio.banktest.domain.Account;
import com.julio.banktest.domain.Client;

public interface IAccountType {
    void typeAccount(Client client, Account account);
}
