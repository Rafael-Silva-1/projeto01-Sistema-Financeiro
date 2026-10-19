# Fluxograma

O diagrama representa o fluxo atual do programa Java.

```mermaid
flowchart TD
    A([Início]) --> B[Declarar variáveis e criar Scanner]
    B --> C[Exibir título]
    C --> D[/Ler nome/]
    D --> E[/Ler salário bruto e desconto/]
    E --> F[Calcular renda líquida]
    F --> G[/Ler despesas fixas e variáveis/]
    G --> H[Calcular despesas totais]
    H --> I[Calcular saldo mensal]
    I --> J[Calcular indicadores financeiros]
    J --> K[/Ler capital inicial e aporte mensal/]
    K --> L[Projetar patrimônio sem juros]
    L --> M[/Ler taxa de juros/]
    M --> N[Aplicar juros aos valores projetados]
    N --> O[Exibir resultados]
    O --> P[Fechar Scanner]
    P --> Q([Fim])
