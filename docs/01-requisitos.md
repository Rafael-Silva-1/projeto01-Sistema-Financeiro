# Requisitos do projeto

## Objetivo
Programa de terminal em Java para visualizar a situação financeira mensal e estimar acumulação de dinheiro.

## Entradas principais
Nome, salário bruto, desconto, despesas fixas e variáveis, capital inicial, aporte mensal e taxa de juros.

## Validações básicas
- Salário bruto de pelo menos R$ 1,00.
- Desconto e despesas não negativos.
- Renda líquida maior que zero.
- Capital inicial não negativo.
- Aporte mensal mínimo de R$ 10,00.
- Taxa de juros maior que zero.
- Despesas superiores à renda são permitidas para demonstrar o déficit.

## Interpretação de resultados
### v1.1.2 — Saldo mensal
- `saldoMensal > 0`: saldo positivo.
- `saldoMensal == 0`: saldo zerado.
- `saldoMensal < 0`: déficit mensal.

### v1.1.3 — Indicadores
- Renda comprometida: menos de 50%, exatamente 50%, acima de 50% até 100%, ou acima de 100%.
- Capacidade de poupança: percentual positivo, zero ou negativo.

As faixas são referências didáticas, não regras financeiras universais.

## Fora do escopo
Tratamento completo de entradas não numéricas, validação de `NaN`/infinito, interface gráfica, armazenamento persistente, recomendações automáticas e refatoração em métodos.
