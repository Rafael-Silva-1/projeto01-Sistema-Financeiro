# Fórmulas financeiras

## Renda líquida
`rendaLiquida = salarioBruto - desconto`

## Despesas totais
`despTotal = despFixa + despVariavel`

## Saldo mensal
`saldoMensal = rendaLiquida - despTotal`

## Indicadores
`comprometida = (despTotal / rendaLiquida) * 100`

`poupar = (saldoMensal / rendaLiquida) * 100`

Renda comprometida:
- Abaixo de 50%: menos da metade.
- Exatamente 50%: metade.
- Acima de 50% até 100%: mais da metade.
- Acima de 100%: despesas superiores à renda líquida.

Capacidade de poupança:
- Maior que zero: parte da renda ficou disponível.
- Igual a zero: não houve sobra.
- Menor que zero: déficit mensal.

As faixas são didáticas. A renda líquida precisa ser positiva para evitar divisão por zero.

## Projeção sem juros
`acumulado12 = capitalInicial + (aplicacao * 12)`

`acumulado24 = capitalInicial + (aplicacao * 24)`

`acumulado60 = capitalInicial + (aplicacao * 60)`

## Simulação complementar com juros
`taxaJuros = (juros / 100) + 1`

`valorComJuros = acumuladoN * Math.pow(taxaJuros, N)`

É uma simulação simplificada: não capitaliza cada aporte mensal individualmente.
