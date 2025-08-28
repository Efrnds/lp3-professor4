import departamento.*;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Cleber", "10383072956", 50000, 2800, 60000);
        Vendedor vendedor2 = new Vendedor("Elizabeth", "10930992834", 50000, 5000, 120000);

        Gerente gerente = new Gerente("Robson", "38491283921", 8000, 100000, 230000);

        int totalVendas = vendedor1.getVendasRealizadas() + vendedor2.getVendasRealizadas();
        gerente.setTotalVendasEquipe(totalVendas);

        vendedor1.exibirDados();
        System.out.println();
        vendedor2.exibirDados();
        System.out.println();
        gerente.exibirDados();
    }
}