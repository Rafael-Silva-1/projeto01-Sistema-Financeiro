Algoritmo "simulador-financeiro"
Var

   nome : Caractere
   salarioBruto, desconto, despFixa, despVariavel : Real
   rendaLiquida, despTotal, saldoMensal : Real
   comprometida, poupar : Real


Inicio
   Escreval("======================================")
   Escreval("          Simulador Financeiro        ")
   Escreval("======================================")

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
   
   
   
   Escreval("")
   Escreval("=====================================")
Fimalgoritmo