# 05 — Casos de teste

Estes casos ajudam a verificar os cálculos do Simulador Financeiro Pessoal. Os valores são exemplos de teste, não dados pessoais.

## Caso 1 — Renda líquida

**Entradas**
- Salário bruto: R$ 2.000,00
- Desconto: R$ 200,00

**Resultado esperado**
- Renda líquida: R$ 1.800,00

## Caso 2 — Despesas totais

**Entradas**
- Despesas fixas: R$ 700,00
- Despesas variáveis: R$ 300,00

**Resultado esperado**
- Despesas totais: R$ 1.000,00

## Caso 3 — Saldo e indicadores

**Entradas**
- Renda líquida: R$ 1.800,00
- Despesas totais: R$ 1.000,00

**Resultados esperados**
- Saldo mensal: R$ 800,00
- Renda comprometida: aproximadamente 55,6%
- Valor disponível para poupar: aproximadamente 44,4%

## Caso 4 — Projeção sem juros

**Entradas**
- Capital inicial: R$ 500,00
- Aporte mensal: R$ 300,00

**Resultados esperados**
- 12 meses: R$ 4.100,00
- 24 meses: R$ 7.700,00
- 60 meses: R$ 18.500,00

## Caso 5 — Conversão da taxa mensal

**Entrada**
- Taxa mensal informada: `0,6`

**Resultado esperado**
- Fator mensal: `1,006`

Isso representa uma taxa de 0,6% por mês.

## Caso 6 — Juros e aportes no mesmo período

**Entradas**
- Capital inicial: R$ 500,00
- Aporte mensal: R$ 300,00
- Taxa mensal: 0,6%
- Aportes realizados no fim de cada mês

**Verificação esperada**
- O valor final com juros deve ser calculado considerando o capital inicial e os aportes dentro do mesmo período.
- O resultado com juros deve ser comparável diretamente com o valor sem juros para 12, 24 e 60 meses.
- Com taxa positiva, o resultado com juros deve ser superior ao resultado sem juros, sob as premissas acima.

**Importante:** a expressão antiga `acumulado12 * Exp(taxaJuros, 12)` capitaliza por mais 12 meses um valor que já representa 12 meses de acumulação sem juros. Ela não é o resultado esperado para este caso de teste.

## Casos de borda conhecidos

| Situação | Comportamento esperado / limitação |
|---|---|
| Renda líquida igual a zero | Os indicadores provocam divisão por zero; não tratado nesta versão sequencial. |
| Taxa de juros igual a 0% | A fórmula de aportes com juros precisa de tratamento alternativo para evitar divisão por zero. |
| Valor de entrada negativo | Não há validação nesta versão. |
| Despesas maiores que a renda líquida | O saldo e o percentual para poupar podem ser negativos; o programa não impede esse resultado. |
