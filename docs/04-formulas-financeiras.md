# 04 — Fórmulas financeiras

Este documento registra as fórmulas utilizadas ou previstas no simulador, com explicações e exemplos.

## 1. Renda líquida

**Fórmula**

`rendaLiquida = salarioBruto - desconto`

**Exemplo:** salário bruto de R$ 2.000,00 e desconto de R$ 200,00.

Resultado: `2000 - 200 = R$ 1.800,00`.

## 2. Despesas totais

**Fórmula**

`despTotal = despFixa + despVariavel`

**Exemplo:** R$ 700,00 de despesas fixas e R$ 300,00 de despesas variáveis.

Resultado: `700 + 300 = R$ 1.000,00`.

## 3. Saldo mensal

**Fórmula**

`saldoMensal = rendaLiquida - despTotal`

**Exemplo:** renda líquida de R$ 1.800,00 e despesas de R$ 1.000,00.

Resultado: `1800 - 1000 = R$ 800,00`.

## 4. Indicadores financeiros

**Renda comprometida (%)**

`comprometida = (despTotal / rendaLiquida) * 100`

**Valor disponível para poupar (%)**

`poupar = (saldoMensal / rendaLiquida) * 100`

**Exemplo:** renda líquida de R$ 1.800,00, despesas de R$ 1.000,00 e saldo de R$ 800,00.

- Renda comprometida: `1000 / 1800 * 100 ≈ 55,6%`.
- Valor disponível para poupar: `800 / 1800 * 100 ≈ 44,4%`.

Esses cálculos exigem que a renda líquida seja diferente de zero.

## 5. Patrimônio sem juros

**Fórmula geral**

`patrimonio = capitalInicial + (aporteMensal * meses)`

**Exemplo:** capital inicial de R$ 500,00 e aporte de R$ 300,00 por mês.

| Período  | Cálculo          | Patrimônio   |
|----------|------------------|------------- |
| 12 meses | 500 + (300 × 12) | R$ 4.100,00  |
| 24 meses | 500 + (300 × 24) | R$ 7.700,00  |
| 60 meses | 500 + (300 × 60) | R$ 18.500,00 |

## 6. Patrimônio com juros compostos e aportes mensais

Para comparar períodos equivalentes, a fórmula deve considerar o capital inicial rendendo durante todo o período e cada aporte mensal rendendo pelo tempo restante até o final do período.

**Premissas:**
- `C` = capital inicial.
- `A` = aporte mensal.
- `i` = taxa de juros mensal em formato decimal.
- `n` = número de meses.
- Os aportes são realizados no fim de cada mês.
- A taxa permanece constante durante o período.

**Fórmula**

`patrimonio = C * (1 + i)^n + A * (((1 + i)^n - 1) / i)`

Se a variável `taxaJuros` já representa o fator `1 + i`, como no algoritmo:

`taxaJuros = 1 + (juros / 100)`

a expressão pode ser escrita assim:

`patrimonio = C * taxaJuros^n + A * ((taxaJuros^n - 1) / (taxaJuros - 1))`

No Visualg, `Exp(base, expoente)` é usada neste projeto para calcular a potência.

**Exemplo ilustrativo:** capital inicial de R$ 500,00, aporte mensal de R$ 300,00 e taxa de 0,6% ao mês (`i = 0,006`). O resultado ao fim de cada período é calculado com a fórmula acima para `n = 12`, `24` e `60`.

> Atenção: quando a taxa é 0%, a fórmula da série de aportes tem divisão por zero. Essa situação ainda precisa ser tratada numa versão futura ou por uma fórmula alternativa. Os resultados também não incluem impostos, tarifas ou inflação.

## 7. Percentual para fator mensal

Se o usuário digitar a taxa como porcentagem, primeiro convertê-la para fator:

`taxaJuros = 1 + (juros / 100)`

Exemplo: `juros = 0,6` resulta em `taxaJuros = 1,006`, equivalente a 0,6% ao mês.
