# 4. Orientação a objetos

## Objetivo da refatoração

A partir da versão 1.4.0, o projeto passa a organizar parte dos dados em classes. A intenção é reduzir a concentração de informações no `Main.java` e preparar o programa para uma separação mais clara de responsabilidades.

## Classes atuais

### Usuario

Representa os dados básicos do usuário:

- `nome`
- `salarioBruto`
- `desconto`

Os atributos são privados. Os métodos getters e setters estão sendo construídos para permitir consulta e alteração controladas.

### Financas

Agrupa os dados relacionados à situação financeira:

- `rendaLiquida`
- `despFixa`
- `despVariavel`
- `despTotal`
- `saldoMensal`
- `comprometida`
- `poupar`

Os atributos são privados. A criação dos métodos de acesso e a integração com o programa principal ainda estão pendentes.

## Encapsulamento

O modificador `private` impede o acesso direto aos atributos a partir de outras classes. Getters e setters são métodos públicos que permitem consultar e modificar os valores de maneira controlada.

Exemplo conceitual:

```java
public double getSalarioBruto() {
    return salarioBruto;
}

public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
}
```

## Próximas etapas

1. Finalizar os métodos getters e setters de `Usuario`.
2. Criar os métodos de acesso de `Financas`.
3. Alterar o `Main.java` para utilizar getters e setters, sem acessar atributos privados diretamente.
4. Avaliar quais cálculos devem permanecer no programa principal e quais devem passar para as classes.
5. Testar se as funcionalidades anteriores continuam funcionando.

## Fora do escopo desta etapa

Herança, polimorfismo, interfaces, banco de dados, APIs e interface gráfica não fazem parte do objetivo imediato desta versão.
