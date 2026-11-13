package entities;

public class Simulacao {

    public double calcularTaxas(double n1) {
        return (n1 / 100) + 1;
    }

    public double calcularAcumulado(double capitalInicial, double aplicacao, int meses) {
        return capitalInicial + (aplicacao * meses);
    }

    public double calcularJurosCompostos(double acumulado, double taxaJuros, int meses) {
        return acumulado * (Math.pow(taxaJuros, meses));
    }

    public void mensagemAcumuloPatrimonio(double meses12, double meses24, double meses60) {
        System.out.printf("Valor acumulado após 12 meses = %.2f%n", meses12);
        System.out.printf("Valor acumulado após 24 meses = %.2f%n", meses24);
        System.out.printf("Valor acumulado após 60 meses = %.2f%n", meses60);
    }
}