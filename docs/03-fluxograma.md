# 03 — Fluxograma

O fluxograma abaixo representa o fluxo principal e as validações implementadas na v1.1.1.

```mermaid
flowchart TD
    A([Início]) --> B[Solicitar nome]
    B --> C[Solicitar salário bruto]
    C --> D{Salário bruto >= R$ 1,00?}
    D -- Não --> X[Exibir erro e encerrar]
    D -- Sim --> E[Solicitar desconto]
    E --> F{Desconto >= 0?}
    F -- Não --> X
    F -- Sim --> G[Calcular renda líquida]
    G --> H{Renda líquida > 0?}
    H -- Não --> X
    H -- Sim --> I[Solicitar despesas fixas e variáveis]
    I --> J{Alguma despesa < 0?}
    J -- Sim --> X
    J -- Não --> K[Calcular despesas totais e saldo]
    K --> L[Calcular indicadores]
    L --> M[Solicitar capital inicial]
    M --> N{Capital inicial >= 0?}
    N -- Não --> X
    N -- Sim --> O[Solicitar aplicação mensal]
    O --> P{Aplicação >= R$ 10,00?}
    P -- Não --> X
    P -- Sim --> Q[Calcular projeções sem juros]
    Q --> R[Solicitar taxa de juros]
    R --> S{Taxa > 0?}
    S -- Não --> X
    S -- Sim --> T[Calcular simulações de juros]
    T --> U([Encerrar])
```

## Observações

- O bloco de despesas permite despesas totais maiores que a renda líquida; o saldo pode ser negativo.
- O diagrama resume as decisões. Entradas não numéricas e valores não finitos ainda não têm tratamento específico nesta versão.
