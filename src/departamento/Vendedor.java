package departamento;

public class Vendedor extends Pessoa {
    private int metaMensal;
    private int vendasRealizadas;
    private double salarioBase;

    public Vendedor(String nome, String cpf, int metaMensal, double salarioBase, int vendasRealizadas) {
        super(nome, cpf);
        this.metaMensal = metaMensal;
        this.vendasRealizadas = vendasRealizadas;
        this.salarioBase = salarioBase;
    }

    public int getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(int metaMensal) {
        this.metaMensal = metaMensal;
    }

    public int getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(int vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void exibirDados() {
        System.out.println("Vendedor: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Meta Mensal: R$ " + metaMensal);
        System.out.println("Vendas Realizadas: R$ " + vendasRealizadas);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.printf("Bonificação: R$ %.2f\n", calcularBonificacao());
    }

    public double calcularBonificacao() {
        double atingimento = (double) vendasRealizadas / metaMensal;
        double percentual = 0.0;

        if (atingimento >= 0.8 && atingimento < 1.0) {
            percentual = 0.025;
        } else if (atingimento >= 1.0 && atingimento < 1.2) {
            percentual = 0.05;
        } else if (atingimento >= 1.2) {
            percentual = 0.075;
        }

        if (vendasRealizadas > metaMensal) {
            double excedente = vendasRealizadas - metaMensal;
            return excedente * percentual;
        } else {
            return 0.0;
        }
    }
}
