# Fórmulas Financeiras

Este documento apresenta as fórmulas utilizadas no Simulador Financeiro Pessoal, versão **v1.1.0**.

## 1. Cálculo da renda líquida

A renda líquida é o salário bruto menos os descontos salariais.

**Fórmula:**

```text
rendaLiquida = salarioBruto - desconto
```

**Exemplo:**

- Salário bruto: R$ 2.000,00
- Desconto: R$ 200,00
- Renda líquida: R$ 1.800,00

## 2. Cálculo das despesas totais

Soma das despesas fixas e variáveis do mês.

**Fórmula:**

```text
despTotal = despFixa + despVariavel
```

**Exemplo:**

- Despesas fixas: R$ 700,00
- Despesas variáveis: R$ 300,00
- Despesas totais: R$ 1.000,00

## 3. Cálculo do saldo mensal

Representa o dinheiro que sobra após subtrair as despesas da renda líquida.

**Fórmula:**

```text
saldoMensal = rendaLiquida - despTotal
```

**Exemplo:**

Com renda líquida de R$ 1.800,00 e despesas totais de R$ 1.000,00, o saldo mensal é de **R$ 800,00**.

## 4. Indicadores financeiros

### 4.1. Renda comprometida

Calcula a porcentagem da renda líquida utilizada para pagar as despesas.

**Fórmula:**

```text
comprometida = (despTotal / rendaLiquida) * 100
```

### 4.2. Valor disponível para poupar

Calcula a porcentagem da renda líquida que sobra após as despesas.

**Fórmula:**

```text
poupar = (saldoMensal / rendaLiquida) * 100
```

**Exemplo:**

Considerando renda líquida de R$ 1.800,00, despesas de R$ 1.000,00 e saldo de R$ 800,00:

- Renda comprometida: aproximadamente 55,6%.
- Valor disponível para poupar: aproximadamente 44,4%.

> **Observação:** os dois indicadores dependem de uma renda líquida diferente de zero.

## 5. Projeção do patrimônio sem juros compostos

Calcula quanto dinheiro pode ser acumulado somando o capital inicial aos aportes mensais, sem considerar rendimentos.

**Fórmula geral:**

```text
patrimonio = capitalInicial + (aplicacao * meses)
```

**Exemplo:**

- Capital inicial: R$ 500,00
- Aporte mensal: R$ 300,00

| Período | Cálculo | Patrimônio acumulado |
|---|---|---:|
| 12 meses | 500 + (300 × 12) | R$ 4.100,00 |
| 24 meses | 500 + (300 × 24) | R$ 7.700,00 |
| 60 meses | 500 + (300 × 60) | R$ 18.500,00 |

## 6. Conversão da taxa de juros

O programa recebe a taxa de juros em porcentagem e a converte em um fator utilizado no cálculo.

**Fórmula:**

```text
taxaJuros = (juros / 100) + 1
```

**Exemplo:**

Para uma taxa informada de 0,6%:

```text
taxaJuros = (0.6 / 100) + 1
taxaJuros = 1.006
```

O fator resultante é `1.006`.

## 7. Simulação de juros compostos

Na versão atual, o programa utiliza os valores já calculados na projeção sem juros e aplica uma potência correspondente ao período informado.

**Fórmula utilizada:**

```java
simulacao = acumulado * Math.pow(taxaJuros, meses);
```

No código, o cálculo é realizado separadamente para cada período:

```java
simularJuros12 = acumulado12 * Math.pow(taxaJuros, 12);
simularJuros24 = acumulado24 * Math.pow(taxaJuros, 24);
simularJuros60 = acumulado60 * Math.pow(taxaJuros, 60);
```

### Como funciona?

1. O programa calcula o patrimônio sem juros, considerando o capital inicial e os aportes mensais.
2. Utiliza cada patrimônio calculado como base para a simulação.
3. Aplica a taxa de juros pelo número de períodos correspondente.

**Limitação atual:** a simulação aplica juros por um período adicional ao período usado para acumular os aportes. Por isso, o resultado não representa uma simulação de juros e aportes ocorrendo simultaneamente ao longo dos mesmos 12, 24 ou 60 meses.

## 8. Limitações dos cálculos

- A renda líquida igual a zero pode causar divisão por zero nos indicadores.
- A taxa de juros igual a zero não recebe tratamento específico.
- O programa não valida valores negativos.
- Não são considerados impostos, tarifas ou inflação.
- Os resultados são projeções matemáticas e não garantem rendimentos reais.
