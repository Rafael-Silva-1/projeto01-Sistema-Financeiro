# 02 — Regras de negócio

As regras abaixo descrevem as validações e os comportamentos implementados no código da versão 1.3.0.

## Renda

- O salário bruto deve ser igual ou superior a R$ 1,00.
- O desconto não pode ser negativo.
- O desconto deve ser menor que o salário bruto.
- A renda líquida é calculada subtraindo o desconto do salário bruto.

## Despesas

- Despesas fixas não podem ser negativas.
- Despesas variáveis não podem ser negativas.
- As despesas totais correspondem à soma das despesas fixas e variáveis.

## Saldo mensal

- O saldo mensal é a renda líquida menos as despesas totais.
- Saldo positivo: o programa informa que houve sobra.
- Saldo igual a zero: o programa informa que toda a renda foi comprometida.
- Saldo negativo: o programa informa que as despesas ultrapassaram a renda líquida.

## Indicadores

- Renda comprometida: percentual das despesas totais em relação à renda líquida.
- Capacidade de poupança: percentual do saldo mensal em relação à renda líquida.

## Projeção de patrimônio

- O capital inicial não pode ser negativo.
- A aplicação mensal deve ser de pelo menos R$ 10,00.
- Os períodos apresentados são 12, 24 e 60 meses.

## Taxa de juros

- A taxa informada deve ser superior a zero.
- O programa converte o percentual para um fator multiplicador antes de calcular a projeção.

## Repetição

- O programa pergunta se o usuário deseja realizar outra simulação.
- A resposta é interpretada pelo primeiro caractere, aceitando `S` ou `N` após conversão para maiúsculas.
