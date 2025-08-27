package empresa.modelo;

public class Gerente extends Pessoa implements Bonificavel{
    protected String departamento;
    protected double salario;

    public Gerente(String nome, int cpf, String departamento, double salario) {
        super(nome, cpf);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {

    }

    @Override
    public double calcularBonificacao() {
        return salario * 0.15;
    }
}
