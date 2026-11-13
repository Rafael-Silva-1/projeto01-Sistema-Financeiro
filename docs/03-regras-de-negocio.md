# 3. Regras de negócio

Este documento registra as validações e regras presentes nas versões anteriores do programa. Os valores e comportamentos devem ser preservados durante a refatoração, salvo alteração planejada em uma versão futura.

## Renda
- O salário bruto deve ser igual ou superior a R$ 1,00.
- O desconto salarial não pode ser negativo.
- O desconto deve ser menor que o salário bruto.
- A renda líquida é calculada subtraindo o desconto do salário bruto.

## Despesas
- Despesas fixas e variáveis não podem ser negativas.
- O total de despesas corresponde à soma das despesas fixas e variáveis.
- O programa permite que as despesas ultrapassem a renda líquida, para que a situação seja apresentada nos indicadores.

## Indicadores
- Renda comprometida: total de despesas dividido pela renda líquida, multiplicado por 100.
- Capacidade de poupança: saldo mensal dividido pela renda líquida, multiplicado por 100.
- As mensagens apresentadas dependem dos percentuais calculados.

## Projeção sem juros
- O capital inicial não pode ser negativo.
- O aporte mensal deve ser de pelo menos R$ 10,00.
- O valor acumulado considera capital inicial mais aportes mensais multiplicados pela quantidade de meses.
- Os períodos apresentados são 12, 24 e 60 meses.

## Juros
- A taxa informada deve ser superior a zero.
- A projeção identificada no programa como “sem novas aplicações” utiliza o montante acumulado como base para a simulação.

## Continuidade
- O usuário pode escolher realizar outra simulação.
- A resposta aceita é S ou N, sem diferenciar maiúsculas de minúsculas.
