# Casos de teste

Os exemplos abaixo podem ser utilizados para conferir os cálculos do programa.

## Caso 1 — Renda líquida

Entradas:
- Salário bruto: 2000
- Desconto: 200

Resultado esperado:
- Renda líquida: 1800

## Caso 2 — Despesas

Entradas:
- Despesas fixas: 700
- Despesas variáveis: 300

Resultado esperado:
- Despesas totais: 1000

## Caso 3 — Saldo e indicadores

Valores:
- Renda líquida: 1800
- Despesas totais: 1000

Resultados esperados:
- Saldo mensal: 800
- Renda comprometida: aproximadamente 55,6%
- Valor disponível para poupar: aproximadamente 44,4%

## Caso 4 — Patrimônio sem juros

Entradas:
- Capital inicial: 500
- Aporte mensal: 300

Resultados esperados:
- 12 meses: 4100
- 24 meses: 7700
- 60 meses: 18500

## Caso 5 — Conversão da taxa

Entrada:
- Taxa informada: 0.6

Resultado esperado:
- Fator de juros: 1.006

## Caso 6 — Simulação de juros

Entradas:
- Capital inicial: 500
- Aporte mensal: 300
- Taxa: 0.6%

Valores usados como base:
- `acumulado12 = 4100`
- `acumulado24 = 7700`
- `acumulado60 = 18500`

O programa aplica a taxa aos valores acima durante 12, 24 e 60 períodos adicionais, respectivamente.

## Limitações conhecidas

- Renda líquida igual a zero pode causar divisão por zero nos indicadores.
- Valores negativos são aceitos sem validação.
- A taxa zero não é tratada separadamente.
- A simulação de juros usa um período adicional após a acumulação sem juros.
- A leitura de números decimais com `Scanner` pode depender da configuração regional do ambiente Java.
