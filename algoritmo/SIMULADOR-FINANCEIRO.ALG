Algoritmo "simulador-financeiro"
Var

   nome : Caractere
   salarioBruto, desconto, despFixa, despVariavel : Real
   rendaLiquida, despTotal, saldoMensal : Real
   comprometida, poupar, aplicacao, capitalInicial : Real
   acumulado12, acumulado24, acumulado60 : Real
   juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60 : Real


Inicio
   Escreval("========================================")
   Escreval("          SIMULADOR FINANCEIRO          ")
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
   Escreval("Renda Comprometida(%) = ", comprometida:8:1)
   Escreval("Valor para poupar(%) = ", poupar:8:1)
   
   
   // Calculo de acumulo de patrimônio
   Escreval("")
   Escreval("Projeção de patrimônio - SEM JUROS COMPOSTOS")
   Escreva("Possui algum valor guardado? Quanto? ")
   leia(capitalInicial)
   Escreva("Quanto deseja aplicar por meses? ")
   Leia(aplicacao)
   acumulado12 <- capitalInicial + (aplicacao * 12)
   Escreval("Valor acumulado apos 12 meses = ", acumulado12:8:2)
   acumulado24 <- capitalInicial + (aplicacao * 24)
   Escreval("Valor acumulado apos 24 meses = ", acumulado24:8:2)
   acumulado60 <- capitalInicial + (aplicacao * 60)
   Escreval("Valor acumulado apos 60 meses = ", acumulado60:8:2)
   
   
   //Simulação e calculo de juros compostos
   Escreval("")
   Escreval("Simulação de juros compostos - SEM NOVAS APLICAÇÕES")
   Escreva("Digite a taxa de juros a ser calculada (%): ")
   Leia(juros)
   taxaJuros <- (juros / 100) + 1
   simularJuros12 <- acumulado12 * (Exp(taxaJuros, 12))
   simularJuros24 <- acumulado24 * (Exp(taxaJuros, 24))
   simularJuros60 <- acumulado60 * (Exp(taxaJuros, 60))
   Escreval("Simulação de juros com 12 meses = ", simularJuros12:8:2)
   Escreval("Simulação de juros com 24 meses = ", simularJuros24:8:2)
   Escreval("Simulação de juros com 60 meses = ", simularJuros60:8:2)
   
   Escreval("")
   Escreval("========================================")
Fimalgoritmo