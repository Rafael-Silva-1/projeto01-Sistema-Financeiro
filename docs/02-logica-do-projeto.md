# Lógica do projeto

## Fluxo geral
1. Criar o `Scanner` e declarar as variáveis necessárias.
2. Iniciar o ciclo principal com `do...while`.
3. Solicitar o nome e apresentar o cabeçalho da simulação.
4. Solicitar os dados financeiros, repetindo a entrada quando um valor não numérico for informado.
5. Validar os limites definidos para os valores financeiros.
6. Calcular renda líquida, despesas totais e saldo mensal.
7. Calcular os indicadores de renda comprometida e capacidade de poupança.
8. Exibir interpretações e recomendações básicas conforme os resultados.
9. Calcular projeções sem juros para 12, 24 e 60 meses.
10. Executar a simulação complementar de juros compostos.
11. Perguntar se o usuário deseja fazer outra simulação.
12. Validar a resposta e repetir o ciclo se a opção de continuar for escolhida; caso contrário, encerrar.

## Tratamento de entradas numéricas
A validação usa `Scanner.hasNextDouble()` para verificar se o próximo item pode ser lido como número. Se não puder, o programa informa o problema e consome a entrada inválida com `next()`, permitindo solicitar o valor novamente.

## Repetição da simulação
O `do...while` executa o conteúdo ao menos uma vez e permite repetir a simulação sem reiniciar manualmente o programa.

## Recomendações financeiras
As mensagens são selecionadas por estruturas condicionais de acordo com o saldo e os indicadores calculados. Elas são orientações gerais para fins didáticos, não aconselhamento financeiro individualizado.
