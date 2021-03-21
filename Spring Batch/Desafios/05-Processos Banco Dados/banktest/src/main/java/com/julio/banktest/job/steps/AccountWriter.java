package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Account;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AccountWriter {

    @Bean
    public JdbcBatchItemWriter<Account> jdbcCursorWriter(@Qualifier("bankDataSource") DataSource dataSource) {
        JdbcBatchItemWriter<Account> writer = new JdbcBatchItemWriter<>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
        writer.setSql("INSERT INTO conta (limite, cliente_id,tipo) VALUES (:limite,:cliente_id,:tipo)");
        writer.setDataSource(dataSource);
        return writer;
    }
}
