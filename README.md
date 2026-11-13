# Simulador Financeiro

**Versão:** 1.4.1  
**Linguagem:** Java  
**Tipo:** Aplicação de console  
**Status:** Concluída

## Sobre o projeto

O Simulador Financeiro é uma aplicação de console desenvolvida em Java para praticar lógica de programação, organização de código e conceitos de Programação Orientada a Objetos (POO).

O programa recebe informações financeiras, calcula renda líquida, despesas e indicadores, apresenta recomendações com base na situação financeira e permite simular o acúmulo de patrimônio em diferentes períodos.

O projeto é desenvolvido em etapas, preservando as funcionalidades existentes enquanto sua estrutura interna evolui.

## Funcionalidades

- Entrada e validação de dados financeiros.
- Cálculo da renda líquida.
- Soma de despesas fixas e variáveis.
- Cálculo do saldo mensal.
- Indicadores de comprometimento da renda e capacidade de poupança.
- Recomendações financeiras baseadas em condições.
- Repetição de simulações na mesma execução.
- Simulação de acúmulo de patrimônio em 12, 24 e 60 meses.
- Projeções com juros compostos, conforme a fórmula implementada no projeto.

## Organização orientada a objetos

Na versão 1.4.1, os métodos e dados foram distribuídos em classes com responsabilidades distintas:

- `Usuario`: armazena nome, salário bruto e desconto; contém métodos relacionados ao cálculo e à exibição da renda líquida.
- `Financas`: reúne os dados financeiros e métodos de cálculo de despesas, saldo, indicadores e situação financeira.
- `Simulacao`: contém os métodos de cálculo de taxa, acúmulo de patrimônio, juros compostos e exibição das projeções.
- `Main`: coordena a execução, entrada e saída de dados e utilização dos objetos.

Os atributos das classes `Usuario` e `Financas` são privados (`private`) e acessados por getters e setters.

## Estrutura do projeto

A organização pode variar de acordo com o ambiente de desenvolvimento. A estrutura lógica utilizada nesta versão é:

```text
Simulador-Financeiro/
├── src/
│   ├── Main.java
│   └── entities/
│       ├── Usuario.java
│       ├── Financas.java
│       └── Simulacao.java
├── docs/
│   ├── 01-visao-geral.md
│   ├── 02-funcionalidades.md
│   ├── 03-regras-de-negocio.md
│   ├── 04-orientacao-a-objetos.md
│   └── 05-historico-de-versoes.md
└── README.md
```

## Tecnologias e conceitos

- Java
- `Scanner` para entrada de dados
- Variáveis, operadores e expressões
- Estruturas condicionais e de repetição
- Métodos, parâmetros e retornos
- Validação de entradas
- Classes e objetos
- Encapsulamento com `private`
- Getters e setters
- Git e GitHub para versionamento

## Como executar

1. Abra o projeto em uma IDE compatível com Java ou em um ambiente com JDK instalado.
2. Compile os arquivos `.java`, respeitando a estrutura dos pacotes.
3. Execute a classe `Main`.

Se estiver usando terminal, entre na pasta de código-fonte e compile os arquivos conforme a organização do seu projeto. O comando exato pode variar conforme a IDE e a estrutura de pastas.

## Documentação complementar

- [Visão geral](docs/01-visao-geral.md)
- [Funcionalidades](docs/02-funcionalidades.md)
- [Regras de negócio](docs/03-regras-de-negocio.md)
- [Orientação a objetos](docs/04-orientacao-a-objetos.md)
- [Histórico de versões](docs/05-historico-de-versoes.md)

## Objetivo de aprendizagem

Além de funcionar como uma aplicação, o projeto é um laboratório de aprendizagem. Cada versão representa uma etapa de evolução, com foco em compreender a lógica, organizar responsabilidades, validar comportamentos e desenvolver autonomia na construção de software.
