package testes;

public class testes {
    public static void main(String[] args){

        double comprometida, despTotal, rendaLiquida, poupar, saldoMensal;
    
        
        rendaLiquida = 1000;
        despTotal = 1700;
        saldoMensal = 0;

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
    }
    
}
