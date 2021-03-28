package com.migracao.migracao.job.steps.pessoastep;

import com.migracao.migracao.domain.Pessoa;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.validation.BindException;

import java.util.Date;

@Configuration
public class FlatMigrationPessoaReader {

    @Bean
    public FlatFileItemReader<Pessoa> migrationPessoaReader() {
        return new FlatFileItemReaderBuilder<Pessoa>()
                .name("migrationPessoaReader")
                .resource(new FileSystemResource("src/main/resources/csv/pessoas.csv"))
                .delimited()
                .names("nome", "email", "dataNascimento", "idade", "id")
                .addComment("--")
                .fieldSetMapper(fieldSetMapper())
                .build();
    }

    private FieldSetMapper<Pessoa> fieldSetMapper() {
        return new FieldSetMapper<Pessoa>() {
            @Override
            public Pessoa mapFieldSet(FieldSet fieldSet) throws BindException {
                return Pessoa.builder()
                        .nome(fieldSet.readString("nome"))
                        .email(fieldSet.readString("email"))
                        .dataNascimento(new Date(fieldSet.readDate("dataNascimento", "yyyy-MM-dd HH:mm:ss").getTime()))
                        .idade(fieldSet.readInt("idade"))
                        .id(fieldSet.readInt("id"))
                        .build();
            }
        };
    }
}
