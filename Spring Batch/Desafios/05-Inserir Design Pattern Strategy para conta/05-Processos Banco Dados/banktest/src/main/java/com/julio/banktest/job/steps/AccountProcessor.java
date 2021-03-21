package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Account;
import com.julio.banktest.domain.Client;
import com.julio.banktest.domain.accounttype.IAccountType;
import com.julio.banktest.domain.accounttype.Prata;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountProcessor {


    @Bean
    public ItemProcessor<Client, Account> doProcessor() {
        return this::processor;
    }

    private Account processor(Client client) {

        return  ;

    }


}
