# Spring Batch

## Primeiro exercício

Baixe o projeto do Alonso em anexo e importe no STS para responder aos exercícios. Para isso, extraia o arquivo zip e acesse o menu File > Import... > Existing Projects into Workspace, selecione o diretório do projeto extraído e pressione Finish.

Perguntas dessa tarefa
Por que o projeto do Alonso não funciona? Liste os problemas encontrados.

Como o Alonso pode corrigir os problemas do seu projeto? Escreva a solução de cada problema encontrado.

### Fixes

01) Adição do H2 no pom
```pom
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<version>1.3.156</version>
</dependency>
```

02) Adição da anotação @EnableBatchProcessing

03) Adição da anotação @Autowired no Job e Step

04) @Bean na classe imprimeOlaJob

05) O método imprimeOlaJob deve ser public

### Persistência dos metadados

01) Configuração do mysql no docker e no projeto 1

## Segundo exercício

Como o Alonso pode corrigir os problemas do seu projeto? Escreva a solução de cada problema encontrado.

1) Adicionar H2 e configuração

2) Correção de pacotes, anotações e parâmetros