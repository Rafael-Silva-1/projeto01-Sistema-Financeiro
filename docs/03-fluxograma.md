# 03 — Fluxograma

O fluxograma representa a sequência principal do Simulador Financeiro Pessoal. Ele pode ser visualizado em leitores de Markdown que ofereçam suporte a Mermaid.

```mermaid
flowchart TD
    A([Início]) --> B[Exibir título do simulador]
    B --> C[/Ler nome do usuário/]
    C --> D[/Ler salário bruto e desconto/]
    D --> E[Calcular renda líquida]
    E --> F[/Ler despesas fixas e variáveis/]
    F --> G[Calcular despesas totais]
    G --> H[Calcular saldo mensal]
    H --> I[Calcular percentuais financeiros]
    I --> J[/Ler capital inicial e aporte mensal/]
    J --> K[Projetar patrimônio sem juros em 12, 24 e 60 meses]
    K --> L[/Ler taxa de juros mensal/]
    L --> M[Simular patrimônio com juros nos mesmos períodos]
    M --> N[Exibir resultados]
    N --> O([Fim])
```

## Observações

- O fluxo é linear: cada etapa acontece na ordem apresentada.
- Não há decisões nem laços de repetição nesta versão.
- O cálculo dos percentuais pressupõe renda líquida diferente de zero.
- A simulação com juros deve usar a fórmula que inclui o capital inicial e os aportes mensais no mesmo horizonte de tempo.
