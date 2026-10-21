# Simulador Financeiro Pessoal

**Versão atual: v1.1.1**

Projeto de estudo desenvolvido em Java para calcular renda líquida, despesas mensais, saldo, indicadores financeiros e projeções simples de patrimônio.

## Funcionalidades

- Leitura do nome do usuário.
- Cálculo da renda líquida a partir do salário bruto e do desconto informado.
- Validação do salário bruto, dos descontos e das despesas.
- Cálculo das despesas totais e do saldo mensal.
- Cálculo do percentual da renda comprometida e da capacidade de poupança.
- Projeção de patrimônio em 12, 24 e 60 meses sem juros.
- Simulação de juros compostos sobre os valores projetados, sem novas aplicações durante essa simulação.

## Regras de validação da v1.1.1

- Salário bruto deve ser de pelo menos R$ 1,00.
- Desconto salarial não pode ser negativo.
- A renda líquida deve ser maior que zero.
- Despesas fixas e variáveis não podem ser negativas.
- O capital inicial pode ser R$ 0,00, mas não pode ser negativo.
- A aplicação mensal deve ser de pelo menos R$ 10,00.
- A taxa de juros informada deve ser maior que zero.
- Despesas totais podem superar a renda líquida. Nesse caso, o programa mostra saldo negativo, renda comprometida acima de 100% e capacidade de poupança negativa.

## Tecnologias e conceitos

- Java
- `Scanner` para entrada de dados
- Tipos `String` e `double`
- Operações aritméticas
- Estruturas condicionais `if`
- `System.out.printf()` para formatar resultados
- `Math.pow()` para a potência usada na simulação de juros

## Como executar

1. Tenha o JDK instalado.
2. Salve o código em um arquivo chamado `Main.java`.
3. No terminal, entre na pasta do arquivo e compile:

   ```bash
   javac Main.java
   ```

4. Execute:

   ```bash
   java Main
   ```

## Limitações conhecidas

- Entradas não numéricas em campos lidos por `nextDouble()` podem causar `InputMismatchException`. O programa ainda não solicita uma nova entrada quando isso acontece.
- A validação de valores não finitos, como `NaN` e infinito, ainda não foi implementada.
- As mensagens de erro e o encerramento do programa estão repetidos em diferentes trechos. A refatoração ficará para uma etapa futura.
- A taxa de juros é interpretada como percentual por período. O programa não identifica nem verifica automaticamente a periodicidade real da taxa.

## Estrutura da documentação

- [`docs/01-requisitos.md`](docs/01-requisitos.md) — regras funcionais e validações.
- [`docs/02-logica-do-projeto.md`](docs/02-logica-do-projeto.md) — sequência de execução e fórmulas.
- [`docs/03-fluxograma.md`](docs/03-fluxograma.md) — fluxo principal do programa.
- [`docs/04-formulas-financeiras.md`](docs/04-formulas-financeiras.md) — fórmulas e interpretação.
- [`docs/05-casos-de-teste.md`](docs/05-casos-de-teste.md) — cenários para verificação manual.
- [`docs/06-seguranca.md`](docs/06-seguranca.md) — limitações e melhorias de programação segura.

## Histórico de versões

### v1.1.1 — Validações de dados

- Adicionada validação de salário bruto mínimo de R$ 1,00.
- Adicionada validação para impedir renda líquida menor ou igual a zero.
- Mantidas validações para descontos e despesas negativas.
- Capital inicial igual a zero permitido.
- Aplicação mensal mínima de R$ 10,00.
- Taxa de juros precisa ser maior que zero.
- Despesas superiores à renda são permitidas para evidenciar déficit financeiro.
- Limitações relacionadas a entradas não numéricas e valores não finitos permanecem conhecidas e documentadas.
