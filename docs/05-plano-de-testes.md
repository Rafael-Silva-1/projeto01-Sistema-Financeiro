# 05 — Plano de testes

Este plano reúne cenários manuais para verificar as funcionalidades da versão 1.3.0. Os testes devem ser executados novamente no ambiente de desenvolvimento antes de cada publicação.

## Renda e validação

| Cenário | Entrada | Resultado esperado |
|---|---|---|
| Salário válido | Salário bruto maior ou igual a R$ 1,00 | Aceitar o valor. |
| Salário inválido | Salário bruto menor que R$ 1,00 | Solicitar novamente. |
| Desconto negativo | Valor menor que zero | Solicitar novamente. |
| Desconto maior que salário | Desconto igual ou superior ao salário | Repetir a etapa de renda. |
| Entrada não numérica | Texto em campo numérico | Exibir erro e solicitar novamente. |

## Despesas e saldo

| Cenário | Renda líquida | Despesas | Saldo esperado |
|---|---:|---:|---:|
| Saldo positivo | R$ 2.000,00 | R$ 1.500,00 | R$ 500,00 |
| Saldo zero | R$ 2.000,00 | R$ 2.000,00 | R$ 0,00 |
| Saldo negativo | R$ 2.000,00 | R$ 2.300,00 | -R$ 300,00 |

## Projeção sem juros

Exemplo de referência:
- Capital inicial: R$ 1.000,00.
- Aplicação mensal: R$ 300,00.

| Período | Resultado esperado |
|---|---:|
| 12 meses | R$ 4.600,00 |
| 24 meses | R$ 8.200,00 |
| 60 meses | R$ 19.000,00 |

## Projeção com juros

Verificar se:
- A taxa aceita apenas valores numéricos superiores a zero.
- O método é chamado para 12, 24 e 60 meses.
- Os valores exibidos correspondem à fórmula registrada em `03-formulas-financeiras.md`.

## Repetição da simulação

- Informar `S` e verificar se uma nova simulação começa.
- Informar `N` e verificar se o programa encerra.
- Informar uma resposta vazia ou iniciada por caractere diferente de `S` ou `N` e verificar a solicitação novamente.

## Registro dos testes

O desenvolvedor informou que os testes das alterações da v1.3.0 foram concluídos sem erros. Este documento funciona como roteiro para repetir a verificação; não é um relatório automatizado de execução.
