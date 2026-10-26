# Requisitos do projeto

## Objetivo
Desenvolver um programa de terminal em Java que ajude a visualizar a situação financeira mensal e estimar a acumulação de dinheiro em diferentes períodos.

## Dados solicitados
- Nome do usuário.
- Salário bruto mensal.
- Desconto salarial.
- Despesas fixas.
- Despesas variáveis.
- Capital inicial.
- Aporte mensal.
- Taxa de juros usada na simulação complementar.

## Regras de validação
- O salário bruto deve ser de pelo menos R$ 1,00.
- Desconto e despesas não podem ser negativos.
- A renda líquida deve ser maior que zero.
- O capital inicial não pode ser negativo.
- O aporte mensal deve respeitar o mínimo definido pelo programa (R$ 10,00).
- A taxa de juros da simulação complementar deve ser maior que zero.
- Valores não numéricos nos campos numéricos devem provocar nova solicitação, em vez de prosseguir com a leitura inválida.
- A resposta à pergunta de nova simulação deve ser validada para aceitar a opção de continuar ou encerrar.

Despesas maiores que a renda líquida podem ser exibidas como déficit; o programa não deve ocultar essa situação.

## Comportamentos esperados
- Calcular renda líquida, despesas totais e saldo mensal.
- Exibir indicadores financeiros e mensagens de interpretação.
- Apresentar projeções sem juros para 12, 24 e 60 meses.
- Apresentar a simulação complementar de juros compostos.
- Permitir executar várias simulações durante a mesma execução do programa.

## Fora do escopo desta versão
- Interface gráfica.
- Armazenamento de dados entre execuções.
- Separação da lógica em métodos ou classes auxiliares.
- Cálculo financeiro detalhado de cada aporte mensal com capitalização individual.
- Validação especializada para todos os valores especiais de ponto flutuante, como `NaN` e infinito.
