package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Client;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class AccountReader {

    @Bean
    public JdbcCursorItemReader<Client> jdbcCursorItemReader(@Qualifier("bankDataSource") DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Client>()
                .name("jdbcCursorItemReader")
                .dataSource(dataSource)
                .sql("SELECT * FROM cliente")
                .rowMapper(new BeanPropertyRowMapper<>(Client.class))
                .build();
    }
}
