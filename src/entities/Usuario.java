package entities;

public class Usuario {
    private String nome;
    private double salarioBruto;
    private double desconto;

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getsalarioBruto() {
        return salarioBruto;
    }

    public void setsalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getdesconto() {
        return desconto;
    }

    public void setdesconto(double desconto) {
        this.desconto = desconto;
    }
}
