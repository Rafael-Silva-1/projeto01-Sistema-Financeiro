# Limitações e cuidados

## Uso educativo
O Simulador Financeiro é um projeto de estudo de Java e lógica de programação. Os resultados não substituem orientação financeira profissional.

## Validação de entradas
A versão 1.2.0 trata entradas não numéricas nos campos numéricos com `Scanner.hasNextDouble()` e descarte da entrada inválida. Ainda assim, a validação depende do formato numérico reconhecido pelo ambiente de execução.

## Dados pessoais
O programa solicita o nome e dados financeiros durante a execução. Conforme a lógica documentada, não há armazenamento persistente dos dados entre execuções. Evite inserir informações reais sensíveis ao compartilhar capturas de tela ou demonstrações públicas.

## Limitações técnicas
- O programa é executado no terminal.
- A lógica continua concentrada no método `main`.
- A simulação de juros é simplificada e não calcula cada aporte individualmente ao longo do tempo.
- As recomendações são baseadas em regras condicionais simples e não consideram todas as circunstâncias pessoais.
- A validação de resposta de continuação deve aceitar apenas as opções previstas pelo programa.

## Próximas melhorias possíveis
- Dividir a lógica em métodos.
- Adotar `BigDecimal` para cálculos monetários com maior controle de precisão.
- Padronizar a leitura de números decimais com vírgula ou ponto.
- Criar testes automatizados.
- Melhorar o modelo de juros compostos para considerar cada aporte mensal.
