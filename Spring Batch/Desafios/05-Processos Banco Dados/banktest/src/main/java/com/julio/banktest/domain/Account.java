package com.julio.banktest.domain;

import com.julio.banktest.domain.enumerated.AccountLimit;
import com.julio.banktest.domain.enumerated.AccountType;
import lombok.Data;


@Data
public class Account {
    Long limite;
    String cliente_id;
    String tipo;

    public Account(Client client) {
        setCliente_id(client.getEmail());
        setTypeOfAccount(client);
    }

    private void setTypeOfAccount(Client client) {
        if (client.getFaixa_salarial() < 3001) {
            setTipo(AccountType.PRATA.toString());
            setLimite(AccountLimit.PRATA.getValue());
        }
        if (client.getFaixa_salarial() > 3000 && client.getFaixa_salarial() < 5001) {
            setTipo(AccountType.OURO.toString());
            setLimite(AccountLimit.OURO.getValue());
        }
        if (client.getFaixa_salarial() > 5000 && client.getFaixa_salarial() > 10001) {
            setTipo(AccountType.PLATINA.toString());
            setLimite(AccountLimit.PLATINA.getValue());
        }
        if (client.getFaixa_salarial() > 10000) {
            setTipo(AccountType.DIAMANTE.toString());
            setLimite(AccountLimit.DIAMANTE.getValue());
        }
    }
}
