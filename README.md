# Simulador Financeiro Pessoal

Projeto em Java desenvolvido para praticar lógica de programação e apresentar uma visão básica da situação financeira mensal do usuário.

## Funcionalidades
- Leitura de informações financeiras pelo terminal.
- Validação básica de valores informados.
- Cálculo da renda líquida, despesas totais e saldo mensal.
- Indicadores de comprometimento da renda e capacidade de poupança.
- Projeções de acumulação em 12, 24 e 60 meses sem juros.
- Simulação complementar de crescimento com juros compostos.
- Interpretação do saldo mensal como positivo, zerado ou negativo.

## Versão atual
**v1.1.2 — Interpretação da situação financeira**

Depois de calcular o saldo mensal:
- Saldo maior que zero: saldo positivo.
- Saldo igual a zero: renda líquida totalmente comprometida com as despesas.
- Saldo menor que zero: despesas superiores à renda líquida, resultando em déficit mensal.

## Tecnologias e conceitos
Java, `Scanner`, variáveis, operadores aritméticos, estruturas condicionais (`if`, `else if`, `else`), `printf` e `Math.pow`.

## Como executar
1. Tenha o JDK instalado.
2. Abra o projeto em uma IDE Java ou compile pelo terminal.
3. Execute a classe `Main`.

```bash
javac Main.java
java Main
```

## Documentação
A pasta `docs/` contém requisitos, lógica, fluxograma, fórmulas, casos de teste e limitações técnicas.

## Limitações conhecidas
- Entradas não numéricas podem causar `InputMismatchException`; o tratamento será estudado em uma versão futura.
- Ainda não há validação específica para `NaN` e infinito.
- A lógica permanece concentrada no método `main`; a refatoração em métodos será considerada depois.
- A simulação de juros compostos é simplificada e não calcula cada aporte mensal capitalizado individualmente.
- Projeto educativo; não substitui orientação financeira profissional.

## Histórico de versões

### v1.1.2 — Interpretação da situação financeira
- Adicionada interpretação do saldo mensal.
- Criadas mensagens para saldo positivo, zerado e negativo.
- Testes manuais dos três cenários realizados com resultados corretos.
- Documentação atualizada.

### v1.1.1 — Validações de dados
- Adicionadas validações básicas para salário, desconto, despesas, capital inicial, aporte mensal e taxa de juros.
- Mantida a exibição de situações em que as despesas superam a renda líquida.
