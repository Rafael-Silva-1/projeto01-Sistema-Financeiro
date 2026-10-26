# Simulador Financeiro Pessoal

Projeto de terminal desenvolvido em Java para praticar lógica de programação e apresentar uma visão básica da situação financeira mensal.

## Funcionalidades

- Solicitação de dados pessoais e financeiros.
- Validação de entradas numéricas, com repetição da pergunta quando o usuário informa um valor não numérico.
- Validação de regras básicas para os valores financeiros.
- Cálculo da renda líquida, despesas totais e saldo mensal.
- Cálculo e interpretação da renda comprometida e da capacidade de poupança.
- Mensagens de orientação básica conforme a situação financeira identificada.
- Projeções de acumulação em 12, 24 e 60 meses sem juros.
- Simulação complementar de crescimento com juros compostos.
- Opção de realizar outra simulação sem encerrar e abrir o programa novamente.
- Validação da resposta para continuar ou encerrar.

## Versão atual

**v1.2.0 — Recomendações financeiras e repetição da simulação**

Esta versão reúne mudanças importantes no fluxo do programa: recomendações baseadas em estruturas condicionais, repetição da simulação com `do...while`, tratamento de entradas não numéricas usando `Scanner` e validação da resposta para executar uma nova simulação.

## Tecnologias e conceitos

- Java
- `Scanner`
- Variáveis e tipos primitivos
- Operadores aritméticos
- Estruturas condicionais (`if`, `else if`, `else`)
- Estruturas de repetição (`while` e `do...while`)
- Validação de entrada com `hasNextDouble()`
- Formatação de saída com `printf`
- `Math.pow` para a simulação de juros compostos

## Como executar

Com o JDK instalado, na pasta que contém `Main.java`, compile e execute:

```bash
javac Main.java
java Main
```

## Documentação

A pasta `docs/` contém:
- `01-requisitos.md` — objetivo, entradas e regras de validação;
- `02-logica-do-projeto.md` — fluxo e comportamento geral;
- `03-fluxograma.md` — representação textual do fluxo;
- `04-formulas-financeiras.md` — fórmulas utilizadas;
- `05-casos-de-teste.md` — cenários para testes manuais;
- `06-seguranca.md` — limitações e cuidados.

## Limitações conhecidas

- A lógica do programa permanece concentrada no método `main`.
- A simulação de juros compostos é simplificada: aplica a taxa ao valor acumulado projetado sem juros, em vez de calcular individualmente cada aporte mensal ao longo do período.
- As mensagens e faixas de interpretação são educativas e não representam regras financeiras universais.
- O programa não substitui orientação financeira profissional.
- A validação de números depende do formato numérico reconhecido pela configuração usada pelo `Scanner`; entradas com vírgula ou ponto decimal podem se comportar de forma diferente conforme a configuração.

## Histórico de versões

### v1.2.0 — Recomendações financeiras e repetição da simulação
- Incluídas recomendações básicas por meio de estruturas condicionais.
- Implementada repetição do fluxo de simulação com `do...while`.
- Incluído tratamento de entradas não numéricas para os campos numéricos.
- Incluída validação da resposta para continuar ou encerrar.
- Testes concluídos sem erros, conforme verificação manual do projeto.
- Documentação preparada para a versão.

### v1.1.3 — Interpretação dos indicadores financeiros
- Adicionadas mensagens para interpretar renda comprometida e capacidade de poupança.

### v1.1.2 — Interpretação da situação financeira
- Adicionadas mensagens para saldo positivo, zerado e negativo.

### v1.1.1 — Validações de dados
- Adicionadas validações básicas de valores financeiros.
