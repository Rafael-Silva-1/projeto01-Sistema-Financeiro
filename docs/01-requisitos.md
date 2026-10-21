# 01 — Requisitos do projeto

## Objetivo

Calcular indicadores básicos da situação financeira mensal do usuário e apresentar projeções simples de acumulação de patrimônio.

## Entradas

| Dado                     | Regra na v1.1.1                      |
|--------------------------|--------------------------------------|
| Nome                     | Texto informado pelo usuário         |
| Salário bruto mensal     | Deve ser maior ou igual a R$ 1,00    |
| Desconto salarial        | Não pode ser negativo                |
| Despesas fixas           | Não podem ser negativas              |
| Despesas variáveis       | Não podem ser negativas              |
| Capital inicial guardado | Pode ser zero; não pode ser negativo |
| Aplicação mensal         | Deve ser maior ou igual a R$ 10,00   |
| Taxa de juros            | Deve ser maior que zero              |

## Regras de negócio

1. A renda líquida é o salário bruto menos o desconto salarial.
2. A renda líquida deve ser maior que zero para o programa continuar.
3. As despesas totais são a soma das despesas fixas e variáveis.
4. O saldo mensal é a renda líquida menos as despesas totais.
5. Despesas maiores que a renda líquida são permitidas. O simulador deve exibir o déficit e os indicadores correspondentes.
6. A renda comprometida é calculada como despesas totais divididas pela renda líquida, multiplicadas por 100.
7. A capacidade de poupança é calculada como saldo mensal dividido pela renda líquida, multiplicado por 100.
8. As projeções sem juros usam o capital inicial somado às aplicações mensais multiplicadas pelo número de meses.
9. A taxa de juros igual a zero é rejeitada nesta versão porque a seção é destinada à simulação com rendimento; o cenário sem rendimento já aparece na projeção anterior.

## Critérios de aceitação

- Valores abaixo dos limites definidos são rejeitados com uma mensagem e encerramento do programa.
- Saldo negativo não causa encerramento por si só.
- Quando as despesas ultrapassam a renda líquida, a renda comprometida pode superar 100% e a capacidade de poupança pode ser negativa.
- Os valores projetados são exibidos para 12, 24 e 60 meses.

## Fora do escopo desta versão

- Repetir a pergunta após uma entrada inválida.
- Tratar de forma controlada texto digitado em campos numéricos.
- Validar explicitamente `NaN` e infinito.
- Usar métodos, funções ou rotinas para eliminar código repetido.
- Persistir dados em arquivos ou banco de dados.
- Autenticação, contas de usuário ou API.
