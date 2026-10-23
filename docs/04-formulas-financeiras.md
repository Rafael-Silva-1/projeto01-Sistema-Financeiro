# Fórmulas financeiras

## Renda líquida
`rendaLiquida = salarioBruto - desconto`

## Despesas totais
`despTotal = despFixa + despVariavel`

## Saldo mensal
`saldoMensal = rendaLiquida - despTotal`

Interpretação adicionada na v1.1.2:
- `saldoMensal > 0`: saldo positivo.
- `saldoMensal == 0`: saldo zerado.
- `saldoMensal < 0`: déficit mensal.

## Indicadores
`comprometida = (despTotal / rendaLiquida) * 100`

`poupar = (saldoMensal / rendaLiquida) * 100`

Despesas podem superar a renda líquida; assim, o comprometimento pode passar de 100% e a capacidade de poupança pode ser negativa.

## Projeção sem juros
`acumulado12 = capitalInicial + (aplicacao * 12)`

`acumulado24 = capitalInicial + (aplicacao * 24)`

`acumulado60 = capitalInicial + (aplicacao * 60)`

## Simulação complementar com juros compostos
`taxaJuros = (juros / 100) + 1`

`valorComJuros = acumuladoN * Math.pow(taxaJuros, N)`

É uma simulação simplificada: como o valor acumulado já inclui os aportes da projeção sem juros, o cálculo não equivale a capitalizar cada aporte mensal durante o período.
