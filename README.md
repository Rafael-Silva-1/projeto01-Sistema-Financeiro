# Simulador Financeiro

**Versão:** 1.3.0  
**Linguagem:** Java  
**Tipo:** Aplicação de console

## Sobre o projeto

O Simulador Financeiro é uma aplicação de console desenvolvida em Java para receber informações financeiras do usuário, calcular renda líquida, despesas, saldo mensal e indicadores financeiros, além de apresentar projeções de acúmulo de patrimônio.

O projeto também é utilizado como prática de lógica de programação, validação de entradas, estruturas de repetição, métodos, parâmetros e retornos.

## Funcionalidades

- Cadastro do nome do usuário durante a execução.
- Leitura e validação de salário bruto e desconto salarial.
- Cálculo da renda líquida.
- Leitura de despesas fixas e variáveis.
- Cálculo das despesas totais e do saldo mensal.
- Exibição da situação financeira conforme o saldo.
- Cálculo dos indicadores de renda comprometida e capacidade de poupança.
- Projeção de patrimônio sem juros para 12, 24 e 60 meses.
- Simulação de juros compostos sem novas aplicações para 12, 24 e 60 meses.
- Repetição da simulação sem reiniciar o programa.

## Novidades da versão 1.3.0

Esta versão tem como foco a organização do código por meio de métodos:

- Criação de métodos com retorno (`double`).
- Criação de métodos sem retorno (`void`).
- Uso de parâmetros e argumentos.
- Separação entre cálculos e exibição de mensagens.
- Reutilização de métodos para calcular projeções em diferentes períodos.
- Redução de cálculos repetidos no método `main`.

## Requisitos

- Java JDK instalado.
- Editor ou terminal capaz de compilar e executar programas Java.

## Como executar

No terminal, dentro da pasta que contém `Main.java`:

```bash
javac Main.java
java Main
```

## Organização dos arquivos

```text
Simulador_Financeiro/
├── Main.java
├── README.md
└── docs/
    ├── 01-visao-geral.md
    ├── 02-regras-de-negocio.md
    ├── 03-formulas-financeiras.md
    ├── 04-metodos-e-organizacao.md
    ├── 05-plano-de-testes.md
    └── 06-historico-de-versoes.md
```

## Observação sobre as projeções

A projeção sem juros considera o capital inicial somado aos aportes mensais multiplicados pela quantidade de meses.

A simulação identificada no programa como **“SEM NOVAS APLICAÇÕES”** aplica o fator de juros ao montante acumulado sem juros do período. Ela não representa aportes mensais rendendo juros mês a mês.

## Próximas melhorias possíveis

- Evoluir a estrutura para Programação Orientada a Objetos.
- Separar responsabilidades em classes.
- Aprimorar a modelagem das projeções financeiras.
- Ampliar os testes automatizados.

## Histórico

Consulte [`docs/06-historico-de-versoes.md`](docs/06-historico-de-versoes.md).
