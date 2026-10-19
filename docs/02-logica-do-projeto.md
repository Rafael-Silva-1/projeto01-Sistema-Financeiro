# Lógica do projeto

O programa executa uma sequência de entradas, cálculos e saídas.

## 1. Identificação

O programa solicita o nome do usuário e armazena a informação na variável `nome`.

## 2. Renda líquida

Entradas:
- `salarioBruto`
- `desconto`

Cálculo:

`rendaLiquida = salarioBruto - desconto`

O resultado representa o salário após a subtração do desconto informado.

## 3. Despesas

Entradas:
- `despFixa`
- `despVariavel`

Cálculo:

`despTotal = despFixa + despVariavel`

## 4. Saldo mensal

Cálculo:

`saldoMensal = rendaLiquida - despTotal`

O saldo pode ser positivo ou negativo, conforme os valores informados.

## 5. Indicadores financeiros

Renda comprometida:

`comprometida = (despTotal / rendaLiquida) * 100`

Valor disponível para poupar:

`poupar = (saldoMensal / rendaLiquida) * 100`

Os resultados são exibidos com uma casa decimal.

## 6. Projeção sem juros

O programa solicita o capital inicial e o aporte mensal.

Fórmulas:

- `acumulado12 = capitalInicial + (aplicacao * 12)`
- `acumulado24 = capitalInicial + (aplicacao * 24)`
- `acumulado60 = capitalInicial + (aplicacao * 60)`

Esses cálculos não incluem rendimentos.

## 7. Simulação de juros compostos

O programa solicita a taxa de juros em porcentagem e converte o valor em um fator:

`taxaJuros = (juros / 100) + 1`

Em seguida, aplica a potência ao patrimônio calculado anteriormente:

- `simularJuros12 = acumulado12 * Math.pow(taxaJuros, 12)`
- `simularJuros24 = acumulado24 * Math.pow(taxaJuros, 24)`
- `simularJuros60 = acumulado60 * Math.pow(taxaJuros, 60)`

Essa etapa não inclui novas aplicações. O patrimônio usado como base, porém, já contém o capital inicial e os aportes mensais da projeção sem juros.

Por isso, a simulação representa um período adicional de capitalização sobre o valor projetado, e não o resultado com juros desde o primeiro mês da acumulação.

## Observações

- A execução é sequencial.
- Não há decisões ou repetições.
- Os indicadores exigem renda líquida diferente de zero.
- A taxa informada é interpretada como porcentagem.
