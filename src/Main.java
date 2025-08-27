import fauna.Ave;
import fauna.Cachorro;
import fauna.Humano;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toto", 14);
        Humano humano = new Humano("João", 45);
        Ave ave = new Ave("PiuPiu", 1);

        System.out.print(cachorro.getNome() + ", " + cachorro.getIdade() + " anos. ");
        cachorro.exibirCaracteristica();
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println();
        System.out.print(humano.getNome() + ", " + humano.getIdade() + " anos. ");
        humano.exibirCaracteristica();
        humano.emitirSom();
        humano.mover();

        System.out.println();
        System.out.print(ave.getNome() + ", " + ave.getIdade() + " anos. ");
        ave.exibirCaracteristica();
        ave.emitirSom();
        ave.mover();
    }
}