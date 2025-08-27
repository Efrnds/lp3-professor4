package fauna;

public abstract class SerVivo {
    protected String nome;
    protected int idade;

    public SerVivo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();
    public abstract void mover();
    public abstract void exibirCaracteristica();
}
