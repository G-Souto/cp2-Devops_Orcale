# Produto API - CP2 DevOps Linux

API REST simples de CRUD de Produtos desenvolvida com Spring Boot.

## Tecnologias

- Java 17
- Spring Boot 3.2.4
- Spring Data JPA

## Como rodar

Abra o projeto no IntelliJ clicando no `pom.xml` e execute a classe `ProdutoApiApplication`.

A aplicação sobe em: `http://localhost:8080`

## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Busca produto por ID |
| POST | `/produtos` | Cria um novo produto |
| PUT | `/produtos/{id}` | Atualiza um produto |
| DELETE | `/produtos/{id}` | Remove um produto |

## Exemplos de uso

### Listar todos
```
GET http://localhost:8080/produtos
```

### Buscar por ID
```
GET http://localhost:8080/produtos/1
```

### Criar produto
```
POST http://localhost:8080/produtos
Content-Type: application/json

{
  "nome": "Notebook Dell",
  "categoria": "Eletrônicos",
  "preco": 3499.90,
  "quantidade": 10
}
```

### Atualizar produto
```
PUT http://localhost:8080/produtos/1
Content-Type: application/json

{
  "nome": "Notebook Dell Atualizado",
  "categoria": "Eletrônicos",
  "preco": 3199.90,
  "quantidade": 8
}
```

### Deletar produto
```
DELETE http://localhost:8080/produtos/1
```

```
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:produtodb
Usuário: sa
Senha: (deixar em branco)
```

## Autor

G-Souto — FIAP 2TDSPW 2026
