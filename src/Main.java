import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIAVEL
        Scanner sc;
        String nome;
        double salarioBruto, desconto, despFixa, despVariavel;
        double rendaLiquida, despTotal, saldoMensal;
        double comprometida, poupar, aplicacao, capitalInicial;
        double acumulado12, acumulado24, acumulado60;
        double juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60;
        // -------------------------------------------------------------------------------------

        sc = new Scanner(System.in);
        
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

        System.out.print("Digite seu salario bruto mensal: ");
        salarioBruto = sc.nextDouble();

        if (salarioBruto < 1){
            System.out.println("SALARIO BRUTO precisa ser no minimo de R$ 1,0.");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        System.out.print("Qual o seu desconto salarial? ");
        desconto = sc.nextDouble();

        if (desconto < 0){
            System.out.println("Os DESCONTOS não podem ser negativos.");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        rendaLiquida = salarioBruto - desconto;

        if (rendaLiquida <= 0){
            System.out.println("Sua RENDA LIQUIDA precisa ser maior que R$ 0,0.");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        System.out.println("Renda Liquida = " + rendaLiquida);
        System.out.println("");
        // CALCULO DE RENDA LIQUIDA: fim


        // CALCULO DE DESPESAS: inicio
        System.out.println("Despesas");
        System.out.print("Quais as suas despesas fixas do mês? ");
        despFixa = sc.nextDouble();

        if (despFixa < 0){
            System.out.println("As DESPESAS FIXAS não podem ser negativas");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        System.out.print("Quais as suas despesas variaveis no mês? ");
        despVariavel = sc.nextDouble();

        if (despVariavel < 0){
            System.out.println("As DESPESAS VARIAVEIS não podem ser negativas");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        despTotal = despFixa + despVariavel;
        System.out.println("Despesas Totais = " + despTotal);
        // CALCULO DE DESPESAS: fim


        // SALDO DO FINAL DO MES: inicio
        System.out.println("");

        saldoMensal = rendaLiquida - despTotal;

        System.out.printf("Saldo Mensal = %.2f%n", saldoMensal);

        System.out.println("");

        if (saldoMensal > 0){
            System.out.println("=== Mês concluído com saldo positivo ===");
        }else if (saldoMensal == 0) {
            System.out.println("=== Todo seu saldo do mês foi comprometido ===");
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
            System.out.println("Menos da  metade de sua renda líquida esta comprometida com despeças");
        }else if (comprometida == 50){
            System.out.println("Metade da sua renda esta comprometida com despesa");
        }else if (comprometida <= 100){
            System.out.println("Mais da metade da renda está comprometida");
        }else{
            System.out.println("as despesas superam a renda líquida");
        }

        System.out.printf("Capacidade de poupança (%%) = %.1f%n",  poupar);

        if (poupar > 0){
            System.out.println("Parte da renda ficou disponível após as despesas");
        }else if (poupar == 0){
            System.out.println("Não sobrou dinheiro no mês");
        }else {
            System.out.println("As despesas ultrapassaram a renda líquida");
        }
        // CALCULO DOS INDICADORES FINANCEIROS: fim


        // CALCULO DE ACUMULO DE PATRIMONIO: inicio
        System.out.println("");
        System.out.println("Projeção de patrimônio - SEM JUROS COMPOSTOS");

        System.out.print("Possui algum valor guardado? Quanto? ");
        capitalInicial = sc.nextDouble();

        if (capitalInicial < 0){
            System.out.println("Valor guardado precisa ser no minimo R$ 0,0.");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        System.out.print("Quanto deseja aplicar por meses? (minimo de R$10,00) ");
        aplicacao = sc.nextDouble();

        if (aplicacao < 10){
            System.out.println("Valor do investimento mensal tem que ser no minimo de R$ 10,00");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
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
        System.out.print("Digite a taxa de juros a ser calculada (Ex: 0,1): ");
        juros = sc.nextDouble();

        if (juros <= 0){
            System.out.println("Taxa de juros precisa ser superior a 0,0.");
            System.out.println("");
            System.out.println("             Fim do Programa            ");
            System.out.println("========================================");
            System.exit(0);
        }

        taxaJuros = (juros / 100) + 1;

        simularJuros12 = acumulado12 * (Math.pow(taxaJuros, 12));
        simularJuros24 = acumulado24 * (Math.pow(taxaJuros, 24));
        simularJuros60 = acumulado60 * (Math.pow(taxaJuros, 60));
        System.out.printf("Simulação de juros com 12 meses = %.2f%n", simularJuros12);
        System.out.printf("Simulação de juros com 24 meses = %.2f%n", simularJuros24);
        System.out.printf("Simulação de juros com 60 meses = %.2f%n", simularJuros60);
        // CALCULO DE PATRIMONIO COM JUROS: fim


        // SINALIZAÇÂO DE ENCERRAMENTO
        System.out.println("");
        System.out.println("                 FIM DO PROGRAMA                ");
        System.out.println("================================================");
        
        sc.close();
    }
}