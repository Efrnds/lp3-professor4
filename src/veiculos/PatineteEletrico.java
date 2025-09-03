package veiculos;

public class PatineteEletrico extends VeiculoBase {
    private boolean luzesLigadas;

    public PatineteEletrico(String modelo, int bateria, int capacidadeMaxima) {
        super(modelo, bateria, capacidadeMaxima);
        this.luzesLigadas = false;
    }

    public void ligarLuzes() {
        luzesLigadas = true;
        System.out.println("Luzes ligadas.");
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Luzes: " + (luzesLigadas ? "Ligadas" : "Desligadas"));
    }
}
