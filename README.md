# Simulador Financeiro Pessoal

Projeto em Java para praticar lógica de programação e apresentar uma visão básica da situação financeira mensal.

## Funcionalidades
- Entrada e validação básica de dados financeiros.
- Cálculo da renda líquida, despesas totais e saldo mensal.
- Indicadores de renda comprometida e capacidade de poupança, com interpretação textual.
- Projeções em 12, 24 e 60 meses sem juros.
- Simulação complementar de crescimento com juros compostos.
- Interpretação de saldo positivo, zerado ou negativo.

## Versão atual
**v1.1.3 — Interpretação dos indicadores financeiros**

Adiciona mensagens para interpretar o percentual de renda comprometida e a capacidade de poupança, usando os cálculos já existentes.

## Tecnologias e conceitos
Java, `Scanner`, variáveis, operadores aritméticos, `if`, `else if`, `else`, `printf` e `Math.pow`.

## Como executar
Com o JDK instalado, compile e execute a classe `Main` na pasta que contém `Main.java`:

```bash
javac Main.java
java Main
```

## Documentação
A pasta `docs/` contém requisitos, lógica, fluxograma, fórmulas, testes e limitações técnicas.

## Limitações conhecidas
- Entradas não numéricas podem causar `InputMismatchException`.
- Ainda não há validação específica para `NaN` e infinito.
- A lógica permanece concentrada no método `main`.
- A simulação de juros compostos é simplificada e não capitaliza cada aporte mensal individualmente.
- Projeto educativo; não substitui orientação financeira profissional.

## Histórico de versões

### v1.1.3 — Interpretação dos indicadores financeiros
- Adicionadas mensagens para renda comprometida e capacidade de poupança.
- Testes planejados realizados sem problemas.
- Documentação atualizada.

### v1.1.2 — Interpretação da situação financeira
- Adicionadas mensagens para saldo positivo, zerado e negativo.
- Três cenários testados manualmente com resultados corretos.

### v1.1.1 — Validações de dados
- Validações básicas de salário, desconto, despesas, capital inicial, aporte e taxa de juros.
