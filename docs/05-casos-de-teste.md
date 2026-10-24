# Casos de teste

## v1.1.3 — Indicadores
O desenvolvedor informou que executou os testes planejados e não encontrou problemas.

Cenários previstos para renda comprometida:
- Abaixo de 50%.
- Exatamente 50%.
- Acima de 50% e abaixo de 100%.
- Exatamente 100%.
- Acima de 100%.

Cenários previstos para capacidade de poupança:
- Percentual positivo.
- Percentual zero.
- Percentual negativo.

## v1.1.2 — Saldo mensal
Os três cenários foram testados manualmente com resultados corretos.

| Caso | Renda líquida | Despesas | Saldo esperado |
|---|---:|---:|---:|
| Positivo | R$ 2.000,00 | R$ 1.500,00 | R$ 500,00 |
| Zerado | R$ 2.000,00 | R$ 2.000,00 | R$ 0,00 |
| Negativo | R$ 2.000,00 | R$ 2.250,00 | -R$ 250,00 |

## Regressão recomendada
Antes de futuras publicações, repetir os testes de validação, indicadores, projeções e interpretação do saldo. Não considerar testes não executados como aprovados.
