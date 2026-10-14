Algoritmo "simulador-financeiro"
Var

   nome : Caractere
   salarioBruto, desconto, despFixa, despVariavel : Real
   rendaLiquida, despTotal, saldoMensal : Real
   comprometida, poupar, aporte, capitalInicial : Real
   acumulado12, acumulado24, acumulado60 : Real
   simulaçãoJuros12, simulaçãoJuros24, simulaçãoJuros60


Inicio
   Escreval("========================================")
   Escreval("          Simulador Financeiro          ")
   Escreval("========================================")

   Escreval("")

   Escreva("Digite seu nome: ")
   Leia(nome)
   
   Escreval("")
   
   // calculo da renda liquida
   Escreval("Renda")
   Escreva("Digite seu salario bruto mensal: ")
   Leia(salarioBruto)
   Escreva("Qual o seu desconto salarial? ")
   Leia(desconto)
   rendaLiquida <- salarioBruto - desconto
   Escreval("Renda Liquida = ", rendaLiquida)
   escreval("")
   
   // calculo das despesas
   Escreval("Despesas")
   Escreva("Quais as suas despesas fixas do mês? ")
   Leia(despFixa)
   Escreva("Quais as suas despesas variaveis no mês? ")
   Leia(despVariavel)
   despTotal <- despFixa + despVariavel
   Escreval("Despesas Totais = ", despTotal)
   

   // dinheiro que sobra no final do mês
   Escreval("")
   saldoMensal <- rendaLiquida - despTotal
   Escreval("Saldo Mensal = ", saldoMensal)
   
   // Calculo de indicadores financeiros
   Escreval("")
   Escreval("Indicadores")
   comprometida <- (despTotal / rendaLiquida) * 100
   poupar <- (saldoMensal / rendaLiquida) * 100
   Escreval("Renda Comprometida(%) = ", comprometida)
   Escreval("Valor para poupar(%) = ", poupar)
   
   
   // Calculo de acumulo de patrimônio
   Escreval("")
   Escreval("Projeção de patrimônio")
   Escreva("Possui algum valor guardado? Quanto? ")
   leia(capitalInicial)
   acumulado12 <- capitalInicial + (saldoMensal * 12)
   Escreval("Valor acumulado apos 12 meses = ", acumulado12)
   acumulado24 <- capitalInicial + (saldoMensal * 24)
   Escreval("Valor acumulado apos 24 meses = ", acumulado24)
   acumulado60 <- capitalInicial + (saldoMensal * 60)
   Escreval("Valor acumulado apos 60 meses = ", acumulado60)
   
   
   //Simulação e calculo de juros compostos
   Escreval("")
   Escreval("Simulação de juros compostos")
   Escreva("Digite a taxa mensal de juros a ser calculada: ")
   Leia(juros)
   montante12 <- acumulado * ((1 + luros) + 12)
   montante24 <- acumulado * ((1 + luros) + 13)
   montande60 <- acumulado * ((1 + luros) + 60
   
   Escreval("")
   Escreval("========================================")
Fimalgoritmo