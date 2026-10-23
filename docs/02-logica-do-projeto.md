# Lógica do projeto

## Fluxo geral
1. Declarar variáveis e apresentar o cabeçalho.
2. Solicitar dados pessoais e financeiros.
3. Validar valores conforme as regras implementadas.
4. Calcular a renda líquida.
5. Calcular despesas totais e saldo mensal.
6. Exibir indicadores financeiros.
7. Interpretar o saldo mensal.
8. Calcular projeções sem juros.
9. Executar a simulação complementar de juros compostos.
10. Encerrar o programa.

## Interpretação do saldo — v1.1.2
O saldo é calculado por `saldoMensal = rendaLiquida - despTotal`.

- Saldo maior que zero: mês terminou com saldo positivo.
- Saldo igual a zero: renda líquida totalmente comprometida com as despesas, sem déficit.
- Saldo menor que zero: despesas ultrapassaram a renda líquida e houve déficit mensal.

A estrutura condicional exibe apenas uma dessas mensagens. Um saldo negativo não bloqueia a execução: é um resultado financeiro válido a ser informado.
