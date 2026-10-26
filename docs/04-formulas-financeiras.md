# Fórmulas financeiras

## Renda líquida
`rendaLiquida = salarioBruto - desconto`

Representa o salário após a subtração dos descontos informados.

## Despesas totais
`despTotal = despFixa + despVariavel`

Soma as despesas fixas e variáveis do mês.

## Saldo mensal
`saldoMensal = rendaLiquida - despTotal`

- Resultado positivo: sobra dinheiro no mês.
- Resultado igual a zero: toda a renda líquida foi comprometida.
- Resultado negativo: as despesas ultrapassam a renda líquida.

## Indicadores

### Renda comprometida
`comprometida = (despTotal / rendaLiquida) * 100`

Indica a porcentagem da renda líquida usada para cobrir despesas.

### Capacidade de poupança
`poupar = (saldoMensal / rendaLiquida) * 100`

Indica a porcentagem da renda líquida que sobra ou falta após as despesas.

## Projeções sem juros
Para cada período, o valor projetado soma o capital inicial aos aportes mensais:

- `acumulado12 = capitalInicial + aplicacao * 12`
- `acumulado24 = capitalInicial + aplicacao * 24`
- `acumulado60 = capitalInicial + aplicacao * 60`

Essas projeções não consideram rendimento.

## Simulação complementar com juros
A taxa é convertida para um fator multiplicador:

`taxaJuros = (juros / 100) + 1`

A simulação aplica o fator ao valor acumulado projetado para o período usando `Math.pow`, por exemplo:

`simularJuros12 = acumulado12 * Math.pow(taxaJuros, 12)`

A mesma lógica é usada para 24 e 60 períodos. Esta é uma aproximação didática: não representa o cálculo completo de aportes mensais com capitalização mês a mês.
