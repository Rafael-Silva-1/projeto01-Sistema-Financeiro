# 02 — Lógica do projeto

## Sequência principal

1. Declarar as variáveis e criar o `Scanner`.
2. Solicitar o nome e exibir o cabeçalho personalizado.
3. Solicitar o salário bruto e rejeitar valores menores que R$ 1,00.
4. Solicitar o desconto e rejeitar valores negativos.
5. Calcular a renda líquida e encerrar se ela for menor ou igual a zero.
6. Solicitar despesas fixas e variáveis, rejeitando valores negativos.
7. Somar as despesas e calcular o saldo mensal.
8. Calcular e apresentar os indicadores financeiros.
9. Solicitar o capital inicial, permitindo zero e rejeitando valores negativos.
10. Solicitar a aplicação mensal e rejeitar valores abaixo de R$ 10,00.
11. Calcular as projeções sem juros para 12, 24 e 60 meses.
12. Solicitar a taxa de juros e rejeitar valores menores ou iguais a zero.
13. Calcular e apresentar as simulações de juros.
14. Exibir a mensagem de encerramento e fechar o `Scanner`.

## Decisões condicionais

A versão usa estruturas `if` para interromper o programa quando uma regra de validação é violada. As validações são sequenciais e não há repetição automática de perguntas.

## Tratamento de déficit

O programa não rejeita despesas totais superiores à renda líquida. Isso é intencional: permite que o usuário veja um saldo negativo e indicadores que evidenciam o déficit.

## Limitações de fluxo

- Se o usuário digitar texto em vez de número em uma chamada a `nextDouble()`, pode ocorrer `InputMismatchException`.
- O programa ainda não oferece uma nova tentativa após entrada inválida.
- A repetição de mensagens de encerramento será considerada para refatoração quando o projeto avançar para métodos e organização em rotinas.
