import fauna.Sabiá;
import fauna.Cachorro;
import fauna.Homem;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toto", 14);
        Homem homem = new Homem("João", 45);
        Sabiá sabiá = new Sabiá("PiuPiu", 1);

        System.out.print(cachorro.getNome() + ", " + cachorro.getIdade() + " anos. ");
        cachorro.exibirCaracteristica();
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println();
        System.out.print(homem.getNome() + ", " + homem.getIdade() + " anos. ");
        homem.exibirCaracteristica();
        homem.emitirSom();
        homem.mover();

        System.out.println();
        System.out.print(sabiá.getNome() + ", " + sabiá.getIdade() + " anos. ");
        sabiá.exibirCaracteristica();
        sabiá.emitirSom();
        sabiá.mover();
    }
}