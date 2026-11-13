# Simulador Financeiro

**Versão:** 1.4.1  
**Linguagem:** Java  
**Tipo:** Aplicação de console  
**Status:** Em desenvolvimento

## Sobre o projeto

O Simulador Financeiro é um projeto desenvolvido para praticar programação Java e conceitos de engenharia de software por meio de uma aplicação que recebe informações financeiras, calcula indicadores e apresenta projeções.

O projeto está sendo evoluído gradualmente. A partir da versão 1.4.0, o foco passou a ser a introdução da Programação Orientada a Objetos (POO), com separação de dados e responsabilidades em classes.

## Funcionalidades já implementadas

- Leitura dos dados financeiros pelo terminal.
- Cálculo da renda líquida.
- Registro e soma de despesas fixas e variáveis.
- Cálculo do saldo mensal.
- Indicadores de comprometimento da renda e capacidade de poupança.
- Recomendações financeiras baseadas em condições.
- Validação de entradas numéricas e de respostas de continuidade.
- Simulação de acúmulo de patrimônio em diferentes períodos.
- Projeções com juros compostos, conforme a lógica implementada no projeto.
- Repetição de simulações na mesma execução.

## Evolução para orientação a objetos

A versão 1.4.1 dá continuidade à reorganização do código iniciada na versão 1.4.0.

Classes criadas:

- `Usuario`: representa os dados do usuário, como nome, salário bruto e desconto.
- `Financas`: reúne os dados calculados e informados relacionados à situação financeira.

Nesta etapa, os atributos dessas classes passaram a utilizar o modificador `private`. Os métodos getters e setters estão sendo implementados e integrados gradualmente.

**Atenção:** esta versão está em desenvolvimento. A integração completa dos atributos privados com o `Main.java`, a revisão dos métodos de acesso e os testes de execução ainda precisam ser concluídos. Portanto, o código desta etapa pode não compilar até que essa integração seja finalizada.

## Estrutura atual prevista

```text
Simulador-Financeiro/
├── src/
│   ├── Main.java
│   └── entities/
│       ├── Usuario.java
│       └── Financas.java
├── docs/
│   ├── 01-visao-geral.md
│   ├── 02-funcionalidades.md
│   ├── 03-regras-de-negocio.md
│   ├── 04-orientacao-a-objetos.md
│   └── 05-historico-de-versoes.md
└── README.md
```

A estrutura pode variar conforme a organização dos arquivos no ambiente de desenvolvimento.

## Tecnologias e conceitos

- Java
- `Scanner` para entrada de dados
- Métodos, parâmetros e retornos
- Estruturas condicionais e de repetição
- Validação de dados
- Classes, objetos e encapsulamento
- Git e GitHub para versionamento

## Documentação

Os documentos complementares estão na pasta [`docs`](docs/):

1. [Visão geral](docs/01-visao-geral.md)
2. [Funcionalidades](docs/02-funcionalidades.md)
3. [Regras de negócio](docs/03-regras-de-negocio.md)
4. [Orientação a objetos](docs/04-orientacao-a-objetos.md)
5. [Histórico de versões](docs/05-historico-de-versoes.md)

## Objetivo de aprendizagem

O projeto também funciona como laboratório de estudos. A implementação é feita por etapas, com foco em compreender a lógica, identificar erros, organizar responsabilidades e evoluir o código sem pular os fundamentos.

## Próximos passos

- Finalizar getters e setters de `Usuario`.
- Criar os métodos de acesso de `Financas`.
- Atualizar o `Main.java` para utilizar os métodos de acesso.
- Avaliar a responsabilidade de cada classe.
- Preservar as funcionalidades existentes durante a refatoração.
- Executar testes após a integração.
- Atualizar a documentação quando a versão estiver concluída.
