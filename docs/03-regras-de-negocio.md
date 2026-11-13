# 03 — Regras de negócio

Este documento registra as validações e regras utilizadas pelo Simulador Financeiro. Os valores são informados pelo usuário durante a execução.

## Validação de entradas

- Salário bruto deve ser de pelo menos R$ 1,00.
- Renda líquida deve ser maior que zero.
- Desconto deve ser igual ou maior que zero.
- Despesas fixas e variáveis devem ser iguais ou maiores que zero.
- Capital inicial deve ser igual ou maior que zero.
- Aplicação mensal deve respeitar o mínimo de R$ 10,00.
- Taxa de juros deve ser maior que zero quando a simulação com rendimento for escolhida.
- Entradas numéricas inválidas são tratadas antes de prosseguir.
- A resposta para continuar deve ser validada como uma opção afirmativa ou negativa (S/N).

## Indicadores financeiros

O comprometimento da renda representa a proporção da renda líquida utilizada pelas despesas. A capacidade de poupança representa a proporção que sobra após as despesas.

As mensagens e classificações são determinadas pelas condições implementadas no código. Valores de despesas superiores à renda não são bloqueados: o programa apresenta o resultado negativo e o indicador correspondente.

## Situação do saldo mensal

- Saldo positivo: apresenta mensagem de saldo positivo e recomendação conforme o valor restante.
- Saldo igual a zero: informa que toda a renda líquida foi comprometida.
- Saldo negativo: informa que as despesas ultrapassaram a renda líquida.

## Períodos de simulação

As projeções são apresentadas para 12, 24 e 60 meses.

## Observação

Este documento descreve o comportamento implementado. Qualquer mudança nas validações, limites ou fórmulas deve ser acompanhada de atualização do código, dos testes e desta documentação.
