# 04 — Métodos e organização do código

## Objetivo da versão 1.3.0

A versão 1.3.0 introduz o uso mais estruturado de métodos para separar cálculos, exibição de mensagens e reutilização de operações.

## Métodos implementados

| Método | Tipo de retorno | Responsabilidade |
|---|---|---|
| `calcularRendaLiquida` | `double` | Calcula a renda líquida. |
| `mensagemRendaLiquida` | `void` | Exibe a renda líquida. |
| `calculoDespesas` | `double` | Soma dois valores de despesas. |
| `situacaoFinanceira` | `void` | Exibe mensagens conforme o saldo mensal. |
| `saldoDoMes` | `double` | Calcula o saldo mensal. |
| `indicadoresFinanceiros` | `double` | Calcula um percentual. |
| `calcularTaxas` | `double` | Converte a taxa percentual em fator multiplicador. |
| `calcularAcumulado` | `double` | Calcula o patrimônio sem juros para um período informado. |
| `calcularJurosCompostos` | `double` | Calcula a projeção de juros utilizada pelo programa. |
| `mensagemAcumuloPatrimonio` | `void` | Exibe as projeções de patrimônio. |

## Parâmetros e reutilização

O método `calcularAcumulado` recebe capital inicial, aplicação mensal e quantidade de meses. Assim, o mesmo método pode ser chamado para os períodos de 12, 24 e 60 meses, sem repetir a fórmula.

O método `calcularJurosCompostos` também recebe o período como parâmetro, permitindo reutilizar a operação para diferentes prazos.

## `double` e `void`

- Métodos com retorno `double` executam um cálculo e devolvem um valor ao ponto em que foram chamados.
- Métodos `void` executam uma ação, como exibir mensagens, sem devolver um valor.

## Organização

Os métodos ficam dentro da classe `Main` e fora do método `main`. O `main` mantém o fluxo principal da aplicação e chama os métodos responsáveis pelos cálculos e pelas mensagens.
