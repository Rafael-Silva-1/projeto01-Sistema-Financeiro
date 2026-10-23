# Requisitos do projeto

## Objetivo
Desenvolver um programa de terminal em Java que ajude o usuário a visualizar sua situação financeira mensal e estimar a acumulação de dinheiro ao longo do tempo.

## Entradas principais
- Nome do usuário.
- Salário bruto.
- Desconto sobre o salário.
- Despesas fixas e variáveis.
- Capital inicial.
- Aporte mensal.
- Taxa de juros para a simulação.

## Validações implementadas na v1.1.1
- Salário bruto de pelo menos R$ 1,00.
- Desconto e despesas não podem ser negativos.
- Renda líquida precisa ser maior que zero.
- Capital inicial não pode ser negativo.
- Aporte mensal mínimo de R$ 10,00.
- Taxa de juros precisa ser maior que zero.
- Despesas maiores que a renda líquida são permitidas para demonstrar o déficit.

## Requisito adicionado na v1.1.2
Após calcular o saldo mensal, identificar uma das situações:
1. Saldo positivo: `saldoMensal > 0`.
2. Saldo zerado: `saldoMensal == 0`.
3. Saldo negativo: `saldoMensal < 0`.

A mensagem exibida deve ser compatível com o resultado.

## Fora do escopo atual
- Tratamento completo de entradas não numéricas.
- Validação específica para `NaN` e infinito.
- Interface gráfica ou aplicação web.
- Armazenamento persistente.
- Recomendações financeiras personalizadas.
- Refatoração da lógica em métodos.
