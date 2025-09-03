package veiculos;

public class CarroEletrico extends VeiculoBase {
    private boolean arCondicionadoLigado;

    public CarroEletrico(String modelo, int bateria, int capacidadeMaxima) {
        super(modelo, bateria, capacidadeMaxima);
        this.arCondicionadoLigado = false;
    }

    public void ligarArCondicionado() {
        if (!arCondicionadoLigado) {
            arCondicionadoLigado = true;
            System.out.println("Ar-condicionado ligado.");
        }
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Ar-condicionado: " + (arCondicionadoLigado ? "Ligado" : "Desligado"));
    }
}
