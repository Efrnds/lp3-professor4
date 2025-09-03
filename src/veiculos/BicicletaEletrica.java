package veiculos;

public class BicicletaEletrica extends VeiculoBase {
    private boolean modoEco;

    public BicicletaEletrica(String modelo, int bateria, int capacidadeMaxima) {
        super(modelo, bateria, capacidadeMaxima);
        this.modoEco = true;
    }

    public void ativarModoEco() {
        modoEco = true;
        System.out.println("Modo eco ativado.");
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Modo Eco: " + (modoEco ? "Ativado" : "Desativado"));
    }
}
