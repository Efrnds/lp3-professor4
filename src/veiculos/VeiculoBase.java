package veiculos;

public abstract class VeiculoBase implements Veiculo {
    protected String modelo;
    protected int bateria;
    protected int velocidadeAtual;
    protected int capacidadeMaxima;

    public VeiculoBase(String modelo, int bateria, int capacidadeMaxima) {
        this.modelo = modelo;
        this.bateria = bateria;
        this.capacidadeMaxima = capacidadeMaxima;
        this.velocidadeAtual = 0;
    }

    @Override
    public void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println(modelo + " está desligado.");
    }

    @Override
    public void recarregar() {
        bateria = 100;
        System.out.println(modelo + " recarregado para 100%.");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Capacidade Máxima: " + capacidadeMaxima);
    }
}
