package fauna;

public class Sabiá extends SerVivo {

    public Sabiá(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.print("canta e ");
    }

    @Override
    public void mover() {
        System.out.print("voa.");
    }

    @Override
    public void exibirCaracteristica() {
        System.out.print("Bipede e oviparo. ");
    }
}
