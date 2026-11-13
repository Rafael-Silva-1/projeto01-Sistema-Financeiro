package entities;

public class Usuario {
    private String nome;
    private double salarioBruto;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public double calcularRendaLiquida(double salarioBruto, double desconto) {
        return salarioBruto - desconto;
    }

    public void mensagemRendaLiquida(double rendaLiquida) {
        System.out.println("");
        System.out.printf("Renda líquida = R$ %.2f%n", rendaLiquida);
        System.out.println("");
    }

}
