package entities;

public class Financas {
    private double rendaLiquida;
    private double despFixa;
    private double despVariavel;
    private double despTotal;
    private double saldoMensal;
    private double comprometida;
    private double poupar;

    public double getRendaLiquida() {
        return rendaLiquida;
    }

    public void setRendaLiquida(double rendaLiquida) {
        this.rendaLiquida = rendaLiquida;
    }

    public double getDespFixa() {
        return despFixa;
    }

    public void setDespFixa(double despFixa) {
        this.despFixa = despFixa;
    }

    public double getDespVariavel() {
        return despVariavel;
    }

    public void setDespVariavel(double despVariavel) {
        this.despVariavel = despVariavel;
    }

    public double getDespTotal() {
        return despTotal;
    }

    public void setDespTotal(double despTotal) {
        this.despTotal = despTotal;
    }

    public double getSaldoMensal() {
        return saldoMensal;
    }

    public void setSaldoMensal(double saldoMensal) {
        this.saldoMensal = saldoMensal;
    }

    public double getComprometida() {
        return comprometida;
    }

    public void setComprometida(double comprometida) {
        this.comprometida = comprometida;
    }

    public double getPoupar() {
        return poupar;
    }

    public void setPoupar(double poupar) {
        this.poupar = poupar;
    }

    public double calculoDespesas(double n1, double n2) {
        return n1 + n2;
    }


    public void situacaoFinanceira(double saldoMensal) {
        if (saldoMensal > 0) {
            System.out.println("=== Mês concluído com saldo positivo ===");

            if (saldoMensal >= 50) {
                System.out.println("Considere começar a guardar parte do dinheiro que sobrou.");
            } else {
                System.out.println("Sua sobra mensal é pequena. Avalie se é possível aumentar sua reserva financeira.");
            }

        } else if (saldoMensal == 0) {
            System.out.println("=== Todo o seu saldo do mês foi comprometido ===");
            System.out.println("");
            System.out.println("Corte custos desnecessários ou busque uma fonte de renda extra para conseguir guardar mais dinheiro no final do mês.");

        } else {
            System.out.println("=== As despesas ultrapassaram a renda líquida ===");
        }
    }

    public double saldoDoMes(double n1, double n2) {
        return n1 - n2;
    }

    public double indicadoresFinanceiros(double n1, double n2) {
        return (n1 / n2) * 100;
    }

}