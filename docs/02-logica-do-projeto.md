# Lógica do projeto

## Fluxo geral
1. Declarar variáveis e apresentar o cabeçalho.
2. Solicitar dados financeiros.
3. Validar valores conforme as regras implementadas.
4. Calcular renda líquida, despesas totais e saldo mensal.
5. Calcular e exibir indicadores financeiros.
6. Interpretar o saldo mensal e os indicadores.
7. Calcular projeções sem juros.
8. Executar a simulação complementar de juros compostos.

## Interpretação dos indicadores — v1.1.3
O programa calcula:
- `comprometida = (despTotal / rendaLiquida) * 100`
- `poupar = (saldoMensal / rendaLiquida) * 100`

A renda comprometida é interpretada em quatro faixas: abaixo de 50%, exatamente 50%, acima de 50% até 100%, e acima de 100%.

A capacidade de poupança é interpretada como positiva, zerada ou negativa. As mensagens não alteram os valores calculados.
