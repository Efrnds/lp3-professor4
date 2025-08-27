package fauna;

public class Ave extends SerVivo {

    public Ave(String nome, int idade) {
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
