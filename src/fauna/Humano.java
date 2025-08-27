package fauna;

public class Humano extends SerVivo {

    public Humano(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.print("fala e ");
    }

    @Override
    public void mover() {
        System.out.print("anda.");
    }

    @Override
    public void exibirCaracteristica() {
        System.out.print("Bipede, ser Humano e racional. ");
    }
}
