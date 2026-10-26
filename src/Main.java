import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIAVEL
        Scanner sc;
        char continuar;
        boolean valorBruto, valorDesconto, valorDespFixa, valorDespVariavel, valorCapInicial, valorAplicacao, valorJuros;
        String nome, resp;
        double salarioBruto, desconto, despFixa, despVariavel;
        double rendaLiquida, despTotal, saldoMensal;
        double comprometida, poupar, aplicacao, capitalInicial;
        double acumulado12, acumulado24, acumulado60;
        double juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60;
        // -------------------------------------------------------------------------------------

        sc = new Scanner(System.in);
        do {
            // CABEÇALHO DO PROGRAMA
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.println("");
            System.out.println("================================================");
            System.out.println("              SIMULADOR FINANCEIRO              ");
            System.out.println("              Usuario: " + nome +"              ");
            System.out.println("================================================");
            System.out.println("");

            // CALCULO DE RENDA LIQUIDA: Inicio
            System.out.println("Renda");

            do{
                salarioBruto = 0;
                valorBruto = false;

                while(!valorBruto){
                    System.out.print("Digite seu salario bruto mensal: ");
                    
                    if (sc.hasNextDouble()){
                        salarioBruto = sc.nextDouble();
                        
                        if (salarioBruto < 1.0){
                            System.out.println("Erro: O salario bruto deve ser igual ou superior a R$1.0 para continuar.");
                        }else{
                            valorBruto = true;
                        }
                    }else{
                        System.out.println("Erro: O dado digitado esta incorreto.");
                        sc.next();
                    }
                }
            
                desconto = 0;
                valorDesconto = false;

                while(!valorDesconto){
                    System.out.print("Qual o seu desconto salarial? ");
                    
                    if (sc.hasNextDouble()){
                        desconto = sc.nextDouble();
                        
                        if (desconto < 0){
                            System.out.println("Erro: Desconto de salario não pode ser negativo.");
                        }else{
                            valorDesconto = true;
                        }
                    }else{
                        System.out.println("Erro: O dado digitado esta incorreto.");
                        sc.next();
                    }
                }

                if(desconto > salarioBruto){
                    System.out.println("Alerta: Os descontos não podem utrapassa o valor do salario bruto.");
                }

            }while(desconto >= salarioBruto);
            
            

            rendaLiquida = salarioBruto - desconto;

            
            System.out.println("");
            System.out.println("Renda Liquida = R$" + rendaLiquida);
            System.out.println("");
            // CALCULO DE RENDA LIQUIDA: fim


            // CALCULO DE DESPESAS: inicio
            System.out.println("Despesas");

            valorDespFixa = false;
            despFixa = 0;

            while (!valorDespFixa){
                System.out.print("Quais as suas despesas fixas do mês? ");

                if(sc.hasNextDouble()){
                    despFixa = sc.nextDouble();
                    if (despFixa < 0) {
                        System.out.println("Erro: As despesas fixas não podem ser negativas");
                    }else{
                        valorDespFixa = true;
                    }
                }else{
                    System.out.println("Erro: O dado digitado esta incorreto.");
                    sc.next();
                }
            }

            valorDespVariavel = false;
            despVariavel = 0;

            while (!valorDespVariavel) {
                System.out.print("Quais as suas despesas variaveis no mês? ");
                if(sc.hasNextDouble()){
                    despVariavel = sc.nextDouble();
                    if(despVariavel < 0){
                        System.out.println("Erro: Despesas variaveis não podem ser negativas.");
                    }else {
                        valorDespVariavel = true;
                    }
                }else {
                    System.out.println("Erro: O dado digitado esta incorreto.");
                    sc.next();
                }
            }

            despTotal = despFixa + despVariavel;

            System.out.println("");
            System.out.println("Despesas Totais = " + despTotal);
            // CALCULO DE DESPESAS: fim


            // SALDO DO FINAL DO MES: inicio
            System.out.println("");

            saldoMensal = rendaLiquida - despTotal;

            System.out.printf("Saldo Mensal = %.2f%n", saldoMensal);

            System.out.println("");

            if (saldoMensal > 0){
                System.out.println("=== Mês concluído com saldo positivo ===");
                if (saldoMensal >= 50){
                    System.out.println("Considere começar a guardar parte do dinheiro que sobrou.");
                }else if (saldoMensal > 0 && saldoMensal < 50) {
                    System.out.println("Sua sobra mensal é pequena. Avalie se é possível aumentar sua reserva financeira.");
                }
            }else if (saldoMensal == 0) {
                System.out.println("=== Todo seu saldo do mês foi comprometido ===");
                System.out.println("");
                System.out.println("Corte custos desnecessários ou busque uma fonte de renda extra para conseguir guardar mais dinheiro no final do mês.");
            }else {
                System.out.println("=== As despesas ultrapassaram a renda liquida ===");
            }
            // SALDO DO FINAL DO MES: fim


            // CALCULO DOS INDICADORES FINANCEIROS: inicio
            System.out.println("");
            System.out.println("Indicadores");

            comprometida = (despTotal / rendaLiquida) * 100;
            poupar = (saldoMensal / rendaLiquida) * 100;

            System.out.printf("Renda Comprometida (%%) = %.1f%n", comprometida);

            if (comprometida < 50){
                System.out.println("Menos da  metade de sua renda líquida esta comprometida com despesas");
            }else if (comprometida == 50){
                System.out.println("Metade da sua renda esta comprometida com despesa");
            }else if (comprometida <= 100){
                System.out.println("Mais da metade da renda está comprometida");
                System.out.println("");
                System.out.println("Avaliar os gastos para encontrar oportunidades de economia.");
            }else{
                System.out.println("as despesas superam a renda líquida");
            }

            System.out.printf("Capacidade de poupança (%%) = %.1f%n",  poupar);

            if (poupar == 0){
                System.out.println("");
                System.out.println("Procurar pequenas despesas que possam ser reduzidas.");
            }
            // CALCULO DOS INDICADORES FINANCEIROS: fim


            // CALCULO DE ACUMULO DE PATRIMONIO: inicio
            System.out.println("");
            System.out.println("Projeção de patrimônio - SEM JUROS COMPOSTOS");

            
            valorCapInicial = false;
            capitalInicial = 0;

            while (!valorCapInicial){
                System.out.print("Possui algum valor guardado? Quanto? ");
                if(sc.hasNextDouble()){
                    capitalInicial = sc.nextDouble();
                    if(capitalInicial < 0){
                        System.out.println("Alerta: O valor de guardado não pode ser menor que 0.");
                    }else{
                        valorCapInicial = true;
                    }
                }else{
                    System.out.println("Erro: O dado digitado esta incorreto.");
                    sc.next();
                }
            }

            
            aplicacao = 0;
            valorAplicacao = false;

            while(!valorAplicacao){
                System.out.print("Quanto deseja aplicar por meses? (minimo de R$10,00) ");
                if(sc.hasNextDouble()){
                    aplicacao = sc.nextDouble();
                    if(aplicacao < 10){
                        System.out.println("Alerta: O valor dos aportes mensais precisão ser maiores que R$ 10,00.");
                    }
                    else{
                        valorAplicacao = true;
                    }
                }else {
                    System.out.println("Erro: O dado digitado esta incorreto.");
                    sc.next();
                }
            }

            acumulado12 = capitalInicial + (aplicacao * 12);
            System.out.printf("Valor acumulado apos 12 meses = %.2f%n", acumulado12);

            acumulado24 = capitalInicial + (aplicacao * 24);
            System.out.printf("Valor acumulado apos 24 meses = %.2f%n", acumulado24);

            acumulado60 = capitalInicial + (aplicacao * 60);
            System.out.printf("Valor acumulado apos 60 meses = %.2f%n", acumulado60);
            // CALCULO DE ACUMULO DE PATRIMONIO: fim




            // CALCULO DE PATRIMONIO COM JUROS: inicio
            System.out.println("");
            System.out.println("Simulação de juros compostos - SEM NOVAS APLICAÇÕES");
            
            juros = 0;
            valorJuros = false;

            while(!valorJuros){
                System.out.print("Digite a taxa de juros a ser calculada (Ex: 0,1): ");
                if(sc.hasNextDouble()){
                    juros = sc.nextDouble();
                    if(juros <= 0){
                        System.out.println("Alerta: A taxa de juros tem que ser um valor superior a 0");
                    }else{
                        valorJuros = true;
                    }
                }else {
                    System.out.println("Erro: O dado digitado esta incorreto.");
                    sc.next();
                }
            }

            taxaJuros = (juros / 100) + 1;

            simularJuros12 = acumulado12 * (Math.pow(taxaJuros, 12));
            simularJuros24 = acumulado24 * (Math.pow(taxaJuros, 24));
            simularJuros60 = acumulado60 * (Math.pow(taxaJuros, 60));
            System.out.printf("Simulação de juros com 12 meses = %.2f%n", simularJuros12);
            System.out.printf("Simulação de juros com 24 meses = %.2f%n", simularJuros24);
            System.out.printf("Simulação de juros com 60 meses = %.2f%n", simularJuros60);
            // CALCULO DE PATRIMONIO COM JUROS: fim

            System.out.println("");
            System.out.println("Deseja fazer outra simulação? S/N ");
            sc.nextLine();
               
            resp = sc.nextLine().trim().toUpperCase();

            while (resp.isEmpty() || (resp.charAt(0) != 'S' && resp.charAt(0) != 'N')){
                System.out.println("");
                System.out.println("Deseja fazer outra simulação? S/N ");
                resp = sc.nextLine().trim().toUpperCase();
            }

            continuar = resp.charAt(0);

        } while (continuar == 'S');

        // SINALIZAÇÂO DE ENCERRAMENTO
        System.out.println("");
        System.out.println("                 FIM DO PROGRAMA                ");
        System.out.println("================================================");

        sc.close();
    }
}