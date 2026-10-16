# 02 — Lógica do projeto

## 1. Visão geral

O programa coleta dados financeiros do usuário, calcula indicadores mensais e faz projeções de patrimônio. A execução segue uma sequência fixa, sem desvios ou repetições.

## 2. Etapas de processamento

### Etapa 1 — Identificação

Solicitar o nome do usuário para iniciar a interação.

### Etapa 2 — Cálculo da renda líquida

**Entradas:** salário bruto e desconto salarial.

**Processamento:**

`rendaLiquida = salarioBruto - desconto`

**Saída:** renda líquida mensal.

### Etapa 3 — Cálculo das despesas

**Entradas:** despesas fixas e variáveis.

**Processamento:**

`despTotal = despFixa + despVariavel`

**Saída:** total de despesas mensais.

### Etapa 4 — Cálculo do saldo mensal

**Processamento:**

`saldoMensal = rendaLiquida - despTotal`

**Saída:** saldo que sobra (ou déficit, caso seja negativo) depois das despesas.

### Etapa 5 — Indicadores financeiros

**Processamento:**

`comprometida = (despTotal / rendaLiquida) * 100`

`poupar = (saldoMensal / rendaLiquida) * 100`

**Saídas:** percentual da renda comprometida com despesas e percentual do saldo em relação à renda líquida.

> Limitação: se a renda líquida for zero, as divisões dos indicadores não podem ser calculadas. A versão sequencial ainda não trata esse caso.

### Etapa 6 — Projeção sem juros compostos

**Entradas:** capital inicial e aporte mensal.

Para cada horizonte, somar o capital inicial aos aportes mensais acumulados:

- 12 meses: `capitalInicial + (aplicacao * 12)`
- 24 meses: `capitalInicial + (aplicacao * 24)`
- 60 meses: `capitalInicial + (aplicacao * 60)`

**Saídas:** patrimônio projetado sem rendimentos.

### Etapa 7 — Simulação com juros compostos

**Entrada:** taxa de juros mensal em porcentagem.

Converter a taxa percentual para um fator mensal:

`taxaJuros = 1 + (juros / 100)`

Para comparar os mesmos períodos da projeção sem juros, considerar tanto o crescimento do capital inicial quanto o crescimento dos aportes mensais realizados ao longo de cada período. A fórmula financeira está detalhada em `04-formulas-financeiras.md`.

**Saídas:** patrimônio simulado ao fim de 12, 24 e 60 meses.

## 3. Entradas, processamento e saídas

| Etapa | Entradas principais | Processamento | Saída |
|---|---|---|---|
| Renda | Salário bruto, desconto | Subtração | Renda líquida |
| Despesas | Despesas fixas e variáveis | Soma | Despesas totais |
| Saldo | Renda líquida, despesas totais | Subtração | Saldo mensal |
| Indicadores | Despesas, saldo, renda líquida | Divisão e multiplicação por 100 | Percentuais |
| Sem juros | Capital inicial, aporte mensal | Soma e multiplicação | Projeções de patrimônio |
| Com juros | Capital inicial, aporte, taxa mensal | Capitalização composta e série de aportes | Projeções com juros |

## 4. Observação sobre a implementação

A documentação descreve a comparação pretendida entre os mesmos horizontes de tempo. A expressão simples `acumulado12 * Exp(taxaJuros, 12)`, por exemplo, capitaliza por mais 12 meses um saldo que já representa 12 meses de aportes. Isso não equivale a uma simulação com juros e aportes durante os mesmos 12 meses. A implementação deve usar a fórmula com aportes mensais descrita no arquivo de fórmulas.
