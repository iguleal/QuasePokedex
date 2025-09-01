# QuasePokedex

Este é um projeto simples em **Spring Boot** que funciona como uma mini Pokedex, permitindo **adicionar, buscar, atualizar e deletar Pokémons**.

## Funcionalidades

- Adicionar um Pokémon com **nome** e **tipo**.
- Buscar todos os Pokémons cadastrados.
- Buscar um Pokémon específico pelo **ID**.
- Atualizar os dados de um Pokémon existente.
- Deletar um Pokémon pelo **ID**.

## Endpoints

| Método HTTP | Endpoint           | Descrição                        |
|-------------|------------------|---------------------------------|
| POST        | `/`               | Adiciona um novo Pokémon         |
| GET         | `/`               | Retorna todos os Pokémons        |
| GET         | `/{id}`           | Retorna um Pokémon pelo ID       |
| PUT         | `/{id}`           | Atualiza um Pokémon pelo ID      |
| DELETE      | `/{id}`           | Deleta um Pokémon pelo ID        |

## Exemplo de JSON para adicionar/atualizar

```json
{
  "name": "Pikachu",
  "type": "Elétrico"
}
