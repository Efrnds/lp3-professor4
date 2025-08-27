package fauna;

public class Cachorro extends SerVivo {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.print("late e ");
    }

    @Override
    public void mover() {
        System.out.print("anda.");
    }

    @Override
    public void exibirCaracteristica() {
        System.out.print("Quadrupede e domesticado. ");
    }
}
