# MoneyTrack

> Aplicação web de controle financeiro pessoal desenvolvida com Java e Spring Boot.

## Sobre o projeto

O **MoneyTrack** permite que o usuário registre e gerencie suas finanças de forma simples e organizada. Com ele é possível cadastrar receitas e despesas, categorizar transações e acompanhar o saldo automaticamente, facilitando o planejamento financeiro do dia a dia.

## Funcionalidades

- Registro de receitas e despesas
- Categorização de transações
- Cálculo automático de saldo
- Organização e planejamento financeiro pessoal

## Tecnologias

- **Java** — linguagem principal
- **Spring Boot** — framework para desenvolvimento da aplicação web
- **Spring Data JPA** — persistência de dados
- **Maven** — gerenciamento de dependências

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/guialveess/moneytrack.git
cd moneytrack
```

2. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

3. Acesse no navegador: `http://localhost:8080`

## Estrutura do projeto

```
moneytrack/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/moneytrack/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Equipe

**Turma:** 3A | **Semestre:** 2026.1

| # | Matrícula | Aluno | E-mail |
|---|-----------|-------|--------|
| 1 | 2025100221 | Bruno José Cavalcanti Duarte Filho | bjcdf@cesar.school |
| 2 | 2025100310 | Bruno Sottomayor Martin | bsm4@cesar.school |
| 3 | 2025200207 | Guilherme Alves de Souza | gas6@cesar.school |
| 4 | 2025100567 | Igor Kaua de Souza Siqueira | lkss2@cesar.school |
| 5 | 2025100201 | Matheus de Assis Carvalho Conolly Silva | maccs@cesar.school |

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
