# Casos de teste

## Testes da v1.1.2 — interpretação do saldo
Os três testes abaixo foram executados manualmente pelo desenvolvedor e tiveram resultados corretos.

| Caso | Renda líquida | Despesas totais | Saldo esperado | Resultado |
|---|---:|---:|---:|---|
| Positivo | R$ 2.000,00 | R$ 1.500,00 | R$ 500,00 | Situação positiva |
| Zerado | R$ 2.000,00 | R$ 2.000,00 | R$ 0,00 | Situação equilibrada |
| Negativo | R$ 2.000,00 | R$ 2.250,00 | -R$ 250,00 | Situação negativa / déficit |

## Testes de regressão recomendados
Em futuras alterações, conferir:
- Salário abaixo do mínimo permitido.
- Desconto negativo.
- Renda líquida igual ou inferior a zero.
- Despesas negativas e despesas superiores à renda líquida.
- Capital inicial negativo.
- Aporte mensal abaixo do mínimo.
- Taxa de juros igual ou inferior a zero.
- Projeções de 12, 24 e 60 meses.
- Cálculo dos indicadores financeiros.

Os itens de regressão são recomendações e não devem ser considerados aprovados sem execução.
