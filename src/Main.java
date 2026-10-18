import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        double salarioBruto, desconto, despFixa, despVariavel;
        double rendaLiquida, despTotal, saldoMensal;
        double comprometida, poupar, aplicacao, capitalInicial;
        double acumulado12, acumulado24, acumulado60;
        double juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60;

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          Simulador Financeiro          ");
        System.out.println("========================================");

        System.out.println("");

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("");

        // calculo da renda liquida
        System.out.println("Renda");

        System.out.print("Digite seu salario bruto mensal: ");
        salarioBruto = sc.nextDouble();
        System.out.print("Qual o seu desconto salarial? ");
        desconto = sc.nextDouble();

        rendaLiquida = salarioBruto - desconto;

        System.out.println("Renda Liquida = " + rendaLiquida);
        System.out.println("");

        // calculo das despesas
        System.out.println("Despesas");
        System.out.print("Quais as suas despesas fixas do mês? ");
        despFixa = sc.nextDouble();
        System.out.print("Quais as suas despesas variaveis no mês? ");
        despVariavel = sc.nextDouble();

        despTotal = despFixa + despVariavel;
        System.out.println("Despesas Totais = " + despTotal);

        // dinheiro que sobra no final do mês
        System.out.println("");
        saldoMensal = rendaLiquida - despTotal;
        System.out.printf("Saldo Mensal = %.2f%n", saldoMensal);

        // Calculo de indicadores financeiros
        System.out.println("");
        System.out.println("Indicadores");

        comprometida = (despTotal / rendaLiquida) * 100;
        poupar = (saldoMensal / rendaLiquida) * 100;

        System.out.printf("Renda Comprometida (%%) = %.1f%n", comprometida);
        System.out.printf("Valor para poupar (%%) = %.1f%n",  poupar);


        // Calculo de acumulo de patrimônio
        System.out.println("");
        System.out.println("Projeção de patrimônio - SEM JUROS COMPOSTOS");

        System.out.print("Possui algum valor guardado? Quanto? ");
        capitalInicial = sc.nextDouble();

        System.out.print("Quanto deseja aplicar por meses? ");
        aplicacao = sc.nextDouble();

        acumulado12 = capitalInicial + (aplicacao * 12);
        System.out.printf("Valor acumulado apos 12 meses = %.2f%n", acumulado12);

        acumulado24 = capitalInicial + (aplicacao * 24);
        System.out.printf("Valor acumulado apos 24 meses = %.2f%n", acumulado24);

        acumulado60 = capitalInicial + (aplicacao * 60);
        System.out.printf("Valor acumulado apos 60 meses = %.2f%n", acumulado60);


        //Simulação e calculo de juros compostos
        System.out.println("");
        System.out.println("Simulação de juros compostos - SEM NOVAS APLICAÇÕES");
        System.out.print("Digite a taxa de juros a ser calculada (Ex: 0,1): ");
        juros = sc.nextDouble();

        taxaJuros = (juros / 100) + 1;

        simularJuros12 = acumulado12 * (Math.pow(taxaJuros, 12));
        simularJuros24 = acumulado24 * (Math.pow(taxaJuros, 24));
        simularJuros60 = acumulado60 * (Math.pow(taxaJuros, 60));
        System.out.printf("Simulação de juros com 12 meses = %.2f%n", simularJuros12);
        System.out.printf("Simulação de juros com 24 meses = %.2f%n", simularJuros24);
        System.out.printf("Simulação de juros com 60 meses = %.2f%n", simularJuros60);

        System.out.println("");
        System.out.println("========================================");
        
        sc.close();
    }
}