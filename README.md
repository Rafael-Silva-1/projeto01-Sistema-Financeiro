# Simulador Financeiro Pessoal 💰

Esse projeto começou em Portugol, usando Visualg, como uma forma de praticar lógica de programação. Agora também tem uma versão em Java, onde continuo desenvolvendo e melhorando o simulador.

O programa recebe informações sobre renda e despesas, calcula alguns indicadores financeiros e faz projeções de quanto dinheiro pode ser acumulado ao longo do tempo.

## O que o programa faz?

- Calcula a renda líquida a partir do salário bruto e dos descontos.
- Soma as despesas fixas e variáveis.
- Calcula o saldo mensal.
- Mostra a porcentagem da renda comprometida com despesas e a porcentagem disponível para poupar.
- Projeta o patrimônio em 12, 24 e 60 meses, sem juros compostos.
- Simula juros compostos sobre os valores projetados, sem novas aplicações durante a etapa de simulação.

## Tecnologias utilizadas

- Portugol / Visualg
- Java
- Git e GitHub

## Estrutura do projeto

```text
simulador-financeiro/
├── docs/
│   ├── 01-requisitos.md
│   ├── 02-logica-do-projeto.md
│   ├── 03-fluxograma.md
│   ├── 04-formulas-financeiras.md
│   └── 05-casos-de-teste.md
├── README.md
└── Main.java
```

## Como executar a versão Java

1. Tenha o JDK instalado.
2. Abra o terminal na pasta onde está o arquivo `Main.java`.
3. Compile o programa:

   `javac Main.java`

4. Execute:

   `java Main`

## Documentação

A pasta `docs/` contém os requisitos do projeto, a explicação da lógica, o fluxograma, as fórmulas utilizadas e alguns casos de teste.

## Limitações atuais

- O programa ainda não valida todas as entradas.
- Se a renda líquida for zero, os indicadores financeiros podem causar divisão por zero.
- A simulação de juros utiliza o patrimônio projetado sem juros como base e aplica a taxa novamente pelo período informado. Portanto, o período total contado desde o início da acumulação é maior que 12, 24 ou 60 meses.
- Não são considerados impostos, tarifas ou inflação.
- O programa não utiliza condicionais nem estruturas de repetição.

## Próximos passos

Continuar testando os cálculos, melhorar a simulação de juros e acrescentar novas funcionalidades conforme avanço nos estudos de Java.

---

Projeto pessoal desenvolvido durante meus estudos de programação.
