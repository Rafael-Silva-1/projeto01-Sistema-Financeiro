# Requisitos do projeto

## Identificação

- Projeto: Simulador Financeiro Pessoal
- Versão: v1.1.0
- Linguagens: Portugol (Visualg) e Java
- Arquivo Java principal: Main.java

## Objetivo

Calcular indicadores financeiros básicos e projetar o acúmulo de patrimônio com base nas informações fornecidas pelo usuário.

## Funcionalidades atuais

1. Solicitar o nome do usuário.
2. Receber salário bruto e desconto salarial.
3. Calcular a renda líquida.
4. Receber despesas fixas e variáveis.
5. Calcular as despesas totais e o saldo mensal.
6. Calcular os indicadores de renda comprometida e valor disponível para poupar.
7. Receber o capital inicial e o aporte mensal.
8. Projetar o patrimônio sem juros para 12, 24 e 60 meses.
9. Receber uma taxa de juros e simular juros compostos sobre os valores projetados.

## Entradas

- Nome.
- Salário bruto mensal.
- Desconto salarial.
- Despesas fixas.
- Despesas variáveis.
- Capital inicial.
- Aporte mensal.
- Taxa de juros informada em porcentagem.

## Saídas

- Renda líquida.
- Despesas totais.
- Saldo mensal.
- Percentual da renda comprometida.
- Percentual disponível para poupar.
- Patrimônio projetado sem juros.
- Valores simulados com juros compostos.

## Tecnologias e conceitos

- Java e classe `Main`.
- Método `main`.
- `Scanner` para entrada de dados.
- Variáveis do tipo `String` e `double`.
- Operações aritméticas.
- `System.out.println`, `System.out.print` e `System.out.printf`.
- `Math.pow` para cálculo de potências.

## Limitações

- Não há validação de entradas negativas.
- A divisão dos indicadores não trata renda líquida igual a zero.
- A taxa de juros zero não recebe tratamento especial.
- A simulação de juros é feita sobre o patrimônio já projetado sem juros, aplicando a taxa por um período adicional.
- Não são considerados impostos, tarifas ou inflação.
- O programa não utiliza condicionais nem estruturas de repetição.
