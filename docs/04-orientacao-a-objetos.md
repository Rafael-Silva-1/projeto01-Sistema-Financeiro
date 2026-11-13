# 04 — Orientação a objetos

## Objetivo da versão

A versão 1.4.1 consolida a introdução da Programação Orientada a Objetos no Simulador Financeiro, distribuindo dados e métodos em classes com responsabilidades específicas.

## Classes

### `Usuario`

Representa os dados básicos do usuário:

- `nome`
- `salarioBruto`
- `desconto`

Os atributos são privados e disponibilizados por getters e setters. A classe também contém métodos relacionados ao cálculo e à exibição da renda líquida.

### `Financas`

Reúne os dados financeiros:

- `rendaLiquida`
- `despFixa`
- `despVariavel`
- `despTotal`
- `saldoMensal`
- `comprometida`
- `poupar`

Os atributos são privados e acessados por getters e setters. A classe contém métodos para somar despesas, calcular o saldo, calcular indicadores e apresentar a situação financeira.

### `Simulacao`

Responsável pelos cálculos e mensagens relacionados às projeções de patrimônio:

- Conversão da taxa de juros.
- Cálculo do acumulado sem rendimento.
- Cálculo da projeção com juros compostos.
- Exibição dos resultados para os períodos simulados.

### `Main`

Coordena o fluxo da aplicação: solicita entradas, utiliza os objetos, chama os métodos correspondentes e apresenta os resultados.

## Conceitos aplicados

- **Classe:** estrutura que agrupa atributos e comportamentos.
- **Objeto:** instância de uma classe utilizada durante a execução.
- **Encapsulamento:** proteção dos atributos com `private`.
- **Getters e setters:** métodos de acesso e alteração dos atributos.
- **Métodos de instância:** comportamentos chamados a partir dos objetos.
- **Separação de responsabilidades:** cada classe concentra operações relacionadas ao seu propósito.

## Escopo não incluído

Esta versão não introduz construtores personalizados, herança, polimorfismo, interfaces, banco de dados ou interface gráfica. Esses assuntos podem ser considerados em versões futuras, sem fazer parte do escopo encerrado da 1.4.1.
