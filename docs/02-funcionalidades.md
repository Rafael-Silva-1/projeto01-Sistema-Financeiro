# 2. Funcionalidades

## Recursos implementados nas versões anteriores

### Dados do usuário e renda
- Solicita o nome do usuário.
- Recebe salário bruto e desconto salarial.
- Calcula a renda líquida.

### Despesas e saldo
- Recebe despesas fixas e variáveis.
- Calcula o total de despesas.
- Calcula o saldo mensal.
- Informa se o saldo é positivo, zero ou negativo.

### Indicadores
- Calcula o percentual da renda comprometida com despesas.
- Calcula a capacidade de poupança em percentual.
- Apresenta mensagens de orientação conforme os resultados.

### Projeções
- Calcula o acúmulo de capital em 12, 24 e 60 meses, considerando capital inicial e aportes mensais.
- Apresenta uma simulação de juros compostos com os valores calculados pelo programa.

### Validações e repetição
- Verifica se as entradas numéricas são válidas.
- Rejeita valores negativos em campos nos quais não são permitidos.
- Permite realizar outra simulação sem reiniciar o programa.
- Valida a resposta de continuidade como S ou N.

## Evolução em andamento na v1.4.1

- Classe `Usuario` criada para agrupar os dados do usuário.
- Classe `Financas` criada para agrupar os dados financeiros.
- Atributos das duas classes definidos como privados.
- Getters e setters de `Usuario` iniciados.
- Integração dos métodos de acesso com `Main.java` ainda pendente.
