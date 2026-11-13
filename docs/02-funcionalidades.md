# 02 — Funcionalidades

## Entrada de dados

O programa solicita informações do usuário e valores necessários para os cálculos financeiros. As entradas numéricas e a resposta de continuidade possuem validações.

## Cálculos financeiros

### Renda líquida

Calculada pela subtração do desconto informado em relação ao salário bruto:

`renda líquida = salário bruto - desconto`

### Despesas totais

As despesas fixas e variáveis são somadas:

`despesas totais = despesas fixas + despesas variáveis`

### Saldo mensal

O saldo é obtido pela diferença entre a renda líquida e as despesas totais:

`saldo mensal = renda líquida - despesas totais`

### Indicadores

O programa calcula o percentual de comprometimento da renda e a capacidade de poupança com base nos valores financeiros informados.

## Recomendações

Mensagens são apresentadas conforme o saldo mensal, indicando saldo positivo, saldo totalmente comprometido ou despesas superiores à renda líquida.

## Simulação de patrimônio

O sistema permite calcular o acúmulo em 12, 24 e 60 meses, considerando capital inicial e aplicação mensal. Também apresenta projeções com juros compostos usando a taxa convertida pelo método de cálculo de taxas.

A fórmula de juros compostos mantida nesta versão é a que já existia no projeto:

`montante projetado = acumulado * Math.pow(taxa, meses)`

A projeção é identificada no programa conforme as condições apresentadas ao usuário. A documentação não altera nem substitui a fórmula implementada.

## Repetição

Após concluir uma simulação, o usuário pode escolher se deseja realizar outra execução do fluxo.
