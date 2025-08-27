package empresa.modelo;

public class Vendedor extends Pessoa implements Bonificavel{
    protected int metaMensal;
    protected int vendasRealizadas;
    protected int salario;

    public Vendedor(String nome, int cpf) {
        super(nome, cpf);
    }

    public Vendedor(String nome, int cpf, int metaMensal, int vendasRealizadas, int salario) {
        super(nome, cpf);
        this.metaMensal = metaMensal;
        this.vendasRealizadas = vendasRealizadas;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {

    }

    @Override
    public void calcularBonificacao() {

    }
}
