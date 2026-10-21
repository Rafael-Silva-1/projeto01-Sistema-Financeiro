# 04 — Fórmulas financeiras

## 1. Renda líquida

A renda líquida é o salário bruto após o desconto informado.

```text
rendaLiquida = salarioBruto - desconto
```

Regra: `rendaLiquida` precisa ser maior que zero para o programa continuar.

## 2. Despesas totais

```text
despTotal = despFixa + despVariavel
```

Despesas fixas e variáveis não podem ser negativas. A soma pode, intencionalmente, ultrapassar a renda líquida.

## 3. Saldo mensal

```text
saldoMensal = rendaLiquida - despTotal
```

- Saldo positivo: sobra dinheiro no mês.
- Saldo igual a zero: toda a renda líquida foi comprometida.
- Saldo negativo: as despesas ultrapassam a renda líquida.

## 4. Renda comprometida

```text
comprometida = (despTotal / rendaLiquida) * 100
```

Quando as despesas são maiores que a renda líquida, o indicador ultrapassa 100%.

## 5. Capacidade de poupança

```text
poupar = (saldoMensal / rendaLiquida) * 100
```

Um resultado negativo indica déficit, não dinheiro disponível para poupar.

## 6. Projeção sem juros

Para um período de `n` meses:

```text
acumulado = capitalInicial + (aplicacao * n)
```

A versão calcula essa projeção para 12, 24 e 60 meses.

## 7. Conversão da taxa

A taxa digitada é interpretada como percentual. O fator usado na potência é:

```text
taxaJuros = (juros / 100) + 1
```

Por exemplo, uma taxa informada como `0,1` representa 0,1% por período, segundo a interpretação do programa.

## 8. Simulação de juros atual

```java
simularJuros12 = acumulado12 * Math.pow(taxaJuros, 12);
simularJuros24 = acumulado24 * Math.pow(taxaJuros, 24);
simularJuros60 = acumulado60 * Math.pow(taxaJuros, 60);
```

Essas fórmulas aplicam juros ao valor acumulado sem juros já calculado. Portanto, cada resultado acrescenta outro período de juros ao montante projetado anteriormente; não modela diretamente depósitos mensais rendendo desde a data de cada depósito.

## 9. Exemplo de déficit

Se a renda líquida for R$ 2.000,00 e as despesas totais forem R$ 2.200,00:

| Indicador | Resultado |
|---|---:|
| Saldo mensal | -R$ 200,00 |
| Renda comprometida | 110% |
| Capacidade de poupança | -10% |

## Limitações

A simulação é educativa e simplificada. Não considera impostos, taxas, inflação, mudanças na taxa de juros ou o momento exato de cada aporte. Os resultados não devem ser interpretados como previsão ou recomendação de investimento.
