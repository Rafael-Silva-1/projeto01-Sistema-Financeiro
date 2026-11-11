# 03 — Fórmulas financeiras

Este documento registra as fórmulas utilizadas pelo código da versão 1.3.0.

## Renda líquida

`rendaLiquida = salarioBruto - desconto`

## Despesas totais

`despTotal = despFixa + despVariavel`

## Saldo mensal

`saldoMensal = rendaLiquida - despTotal`

## Renda comprometida

`comprometida = (despTotal / rendaLiquida) * 100`

## Capacidade de poupança

`poupar = (saldoMensal / rendaLiquida) * 100`

## Acúmulo sem juros

`acumulado = capitalInicial + (aplicacaoMensal * meses)`

O cálculo considera o capital inicial e a soma dos aportes mensais, sem rendimento.

## Fator da taxa

`taxaJuros = (juros / 100) + 1`

## Projeção com juros apresentada pelo programa

`simulacao = acumulado * Math.pow(taxaJuros, meses)`

**Limitação importante:** a projeção com juros utiliza o montante acumulado sem juros como base e aplica o fator de juros pelo período completo. O programa identifica essa etapa como uma simulação sem novas aplicações. O cálculo não modela cada aporte mensal rendendo juros desde a data em que foi realizado.
