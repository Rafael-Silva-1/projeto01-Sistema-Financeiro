# Segurança e limitações técnicas

## Estado atual
Projeto educacional local executado no terminal, sem autenticação, banco de dados ou serviços externos.

## Limitações conhecidas
- `Scanner.nextDouble()` pode lançar `InputMismatchException` para entradas não numéricas ou em formato inesperado.
- Não há validação explícita para `NaN` e infinito.
- A lógica permanece concentrada no método `main`.
- As validações atuais cobrem regras básicas, não todos os casos possíveis.

## Melhorias futuras
- Tratamento de entradas inválidas.
- Validação de valores não finitos.
- Separação de entrada/saída, cálculos e validações.
- Testes automatizados.
- Revisão de precisão monetária, considerando `BigDecimal` quando apropriado.

## Uso responsável
Os resultados são estimativas educativas e não constituem aconselhamento financeiro.
