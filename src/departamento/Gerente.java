package departamento;

public class Gerente extends Pessoa {
    private double salarioBase;
    private int metaEquipe;
    private int totalVendasEquipe;

    public Gerente(String nome, String cpf, double salarioBase, int metaEquipe, int totalVendasEquipe) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.metaEquipe = metaEquipe;
        this.totalVendasEquipe = totalVendasEquipe;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getMetaEquipe() {
        return metaEquipe;
    }

    public void setMetaEquipe(int metaEquipe) {
        this.metaEquipe = metaEquipe;
    }

    public int getTotalVendasEquipe() {
        return totalVendasEquipe;
    }

    public void setTotalVendasEquipe(int totalVendasEquipe) {
        this.totalVendasEquipe = totalVendasEquipe;
    }

    @Override
    public void exibirDados() {
        System.out.println("Gerente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Meta da Equipe: R$ " + metaEquipe);
        System.out.println("Total de Vendas da Equipe: R$ " + totalVendasEquipe);
        System.out.printf("Bonificação: R$ %.2f\n", calcularBonificacao());
    }

    public double calcularBonificacao() {
        double atingimento = (double) totalVendasEquipe / metaEquipe;
        double percentual = 0.0;

        if (atingimento >= 0.8 && atingimento < 1.0) {
            percentual = 0.05;
        } else if (atingimento >= 1.0 && atingimento < 1.2) {
            percentual = 0.10;
        } else if (atingimento >= 1.2) {
            percentual = 0.15;
        }

        if (totalVendasEquipe > metaEquipe) {
            double excedente = totalVendasEquipe - metaEquipe;
            return excedente * percentual;
        } else {
            return 0.0;
        }
    }
}
