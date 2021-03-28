package com.migracao.migracao.job.steps.dadobancariostep;

import com.migracao.migracao.domain.DadosBancarios;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class FlatMigrationDataBankReader {

    @Bean
    public FlatFileItemReader<DadosBancarios> migrationDataBankReader() {
        return new FlatFileItemReaderBuilder<DadosBancarios>()
                .name("migrationDataBankReader")
                .resource(new FileSystemResource("src/main/resources/csv/dados_bancarios.csv"))
                .delimited()
                .names("pessoaId", "agencia", "conta", "banco", "id")
                .addComment("--")
                .targetType(DadosBancarios.class)
                .build();
    }
}
