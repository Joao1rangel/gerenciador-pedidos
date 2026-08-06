# Gerenciador de Pedidos

Projeto de estudo desenvolvido durante o curso "Java: persistência de dados e consultas com Spring Data JPA" da Alura, como parte do desafio prático da Aula 02.

## 🎯 Objetivo

Praticar conceitos de JPA e Spring Data, incluindo:
- Mapeamento de entidades com `@Entity`, `@Id`, `@GeneratedValue` e `@Column`
- Diferença entre chaves geradas automaticamente e manuais
- Criação de repositórios com `JpaRepository`
- Persistência de dados usando `CommandLineRunner`

## 🛠️ Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## 📦 Entidades

- **Produto**: id, nome (único, não nulo), preço (mapeado para coluna `valor`)
- **Categoria**: id, nome
- **Pedido**: id, data

## ⚙️ Configuração

O projeto usa variáveis de ambiente para as credenciais do banco de dados:
- `DB_HOST`
- `DB_USER`
- `DB_PASSWORD`

## 🚀 Como executar

1. Clone o repositório
2. Configure as variáveis de ambiente do banco PostgreSQL
3. Crie o banco de dados `gerenciador_pedidos`
4. Execute a classe `GerenciadorPedidosApplication`
