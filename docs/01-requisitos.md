# 01 — Requisitos do projeto

## 1. Identificação

- **Projeto:** Simulador Financeiro Pessoal
- **Versão documentada:** v1.0.5
- **Linguagem atual:** Portugol, utilizando Visualg
- **Tipo de programa:** aplicação de linha de comando com estrutura sequencial

## 2. Objetivo

Ajudar o usuário a visualizar sua situação financeira mensal e projetar como o patrimônio pode crescer ao longo do tempo, comparando uma acumulação sem rendimentos com uma simulação que considera juros compostos.

## 3. Funcionalidades

1. Solicitar o nome do usuário.
2. Receber salário bruto e desconto salarial e calcular a renda líquida.
3. Receber despesas fixas e variáveis e calcular as despesas totais.
4. Calcular o saldo mensal após as despesas.
5. Calcular os percentuais da renda comprometida e disponível para poupar.
6. Receber o capital já guardado e o aporte mensal desejado.
7. Projetar o patrimônio sem juros após 12, 24 e 60 meses.
8. Simular o crescimento do patrimônio com juros compostos para os mesmos períodos.

## 4. Entradas

- Nome do usuário.
- Salário bruto mensal.
- Desconto salarial.
- Despesas fixas mensais.
- Despesas variáveis mensais.
- Capital inicial guardado.
- Valor do aporte mensal.
- Taxa de juros mensal em porcentagem.

## 5. Resultados apresentados

- Renda líquida.
- Total de despesas.
- Saldo mensal.
- Percentual da renda comprometida.
- Percentual da renda disponível para poupar.
- Patrimônio projetado sem juros em 12, 24 e 60 meses.
- Patrimônio simulado com juros compostos nos mesmos horizontes.

## 6. Regras e premissas financeiras

- Todos os valores monetários são informados na mesma moeda, por exemplo, reais (R$).
- O desconto salarial e as despesas são informados como valores monetários, não como percentuais.
- O aporte é entendido como um valor mensal.
- A taxa informada para juros compostos é mensal e deve ser digitada em porcentagem: por exemplo, `0,6` representa `0,6% ao mês`.
- Para comparar períodos equivalentes, a simulação com juros deve considerar o capital inicial e os aportes mensais dentro do mesmo período de 12, 24 ou 60 meses.
- A fórmula de aportes mensais documentada considera os depósitos no fim de cada mês.

## 7. Limitações da versão

- O algoritmo usa estrutura sequencial: entradas, cálculos e saídas.
- Esta versão não utiliza condicionais, estruturas de repetição, vetores, coleções, banco de dados ou métodos próprios.
- Não há validação automática para entradas negativas, renda líquida igual a zero ou taxa de juros igual a zero.
- Os resultados são projeções matemáticas, não garantias de rendimento.
- A simulação não considera impostos, tarifas, inflação ou variações da taxa de juros.
