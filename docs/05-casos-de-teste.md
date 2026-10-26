# Casos de teste

Os testes abaixo servem como referência para verificar o comportamento do programa. O responsável pelo projeto informou que os testes da versão 1.2.0 foram concluídos sem erros.

| Cenário | Entrada ou ação | Resultado esperado |
|---|---|---|
| Dados financeiros válidos | Informar valores numéricos dentro das regras | Programa calcula e apresenta os resultados |
| Texto em campo numérico | Digitar letras em vez de um número | Programa avisa e solicita o valor novamente |
| Valor negativo em campo restrito | Informar desconto ou despesa negativa | Programa rejeita o valor conforme a regra implementada |
| Salário abaixo do mínimo | Informar valor menor que R$ 1,00 | Programa não aceita o valor |
| Renda líquida inválida | Informar desconto igual ou superior ao salário | Programa não prossegue com renda líquida inválida |
| Despesas maiores que a renda | Informar despesas totais acima da renda líquida | Programa apresenta saldo negativo e a interpretação correspondente |
| Nova simulação | Responder `S` à pergunta final | Programa reinicia o fluxo de entrada |
| Encerrar | Responder `N` à pergunta final | Programa encerra a simulação |
| Resposta inválida à pergunta final | Digitar uma resposta diferente das opções aceitas | Programa solicita uma resposta válida novamente |

## Registro
O resultado global informado para os testes da versão 1.2.0 foi: concluídos sem erros. Esta documentação não registra valores de entrada e saída específicos para cada teste individual.
