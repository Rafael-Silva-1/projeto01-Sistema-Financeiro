# 05 — Casos de teste

Estes cenários devem ser executados manualmente pelo desenvolvedor. A documentação não afirma que todos já foram executados.

| ID | Entrada/cenário | Resultado esperado |
|---|---|---|
| CT01 | Salário bruto de R$ 0,00 | Rejeitar; mínimo é R$ 1,00 |
| CT02 | Salário bruto de R$ 1,00 e desconto de R$ 0,00 | Passar pela validação de salário e desconto; renda líquida será R$ 1,00 |
| CT03 | Desconto negativo | Rejeitar |
| CT04 | Desconto igual ao salário bruto | Rejeitar porque renda líquida será zero |
| CT05 | Desconto maior que salário bruto | Rejeitar porque renda líquida será negativa |
| CT06 | Despesas fixas negativas | Rejeitar |
| CT07 | Despesas variáveis negativas | Rejeitar |
| CT08 | Despesas totais menores que renda líquida | Calcular saldo positivo e indicadores |
| CT09 | Despesas totais iguais à renda líquida | Exibir saldo zero, renda comprometida de 100% e capacidade de poupança de 0% |
| CT10 | Despesas totais maiores que renda líquida | Permitir; exibir saldo negativo, renda comprometida acima de 100% e capacidade de poupança negativa |
| CT11 | Capital inicial de R$ 0,00 | Aceitar |
| CT12 | Capital inicial negativo | Rejeitar |
| CT13 | Aplicação mensal de R$ 9,99 | Rejeitar |
| CT14 | Aplicação mensal de R$ 10,00 | Aceitar |
| CT15 | Taxa de juros igual a zero | Rejeitar |
| CT16 | Taxa de juros negativa | Rejeitar |
| CT17 | Taxa de juros positiva | Calcular simulações |
| CT18 | Texto no lugar de um valor numérico | Pode ocorrer `InputMismatchException`; limitação conhecida |
| CT19 | `NaN` ou infinito em campo numérico | Não há validação específica nesta versão; comportamento deve ser investigado em etapa futura |

## Cenário de referência: déficit financeiro

Entradas:
- Salário bruto: R$ 2.500,00
- Desconto: R$ 500,00
- Despesas fixas: R$ 1.500,00
- Despesas variáveis: R$ 700,00

Resultados esperados:
- Renda líquida: R$ 2.000,00
- Despesas totais: R$ 2.200,00
- Saldo mensal: -R$ 200,00
- Renda comprometida: 110,0%
- Capacidade de poupança: -10,0%

Para completar a execução do programa, informar também capital inicial igual ou maior que zero, aplicação mensal de pelo menos R$ 10,00 e taxa de juros positiva.

## Registro dos resultados

Ao executar os testes, registrar para cada caso: data, resultado observado, aprovado/reprovado e observações. Corrigir discrepâncias antes de marcar a versão como testada.
