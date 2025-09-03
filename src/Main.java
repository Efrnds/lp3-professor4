import veiculos.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<VeiculoBase> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new CarroEletrico("Tesla Model 3", 80, 5));
        listaVeiculos.add(new BicicletaEletrica("Caloi E-Vibe", 60, 1));
        listaVeiculos.add(new PatineteEletrico("Xiaomi M365", 40, 1));

        for (VeiculoBase v : listaVeiculos) {
            v.ligar();
            v.exibirStatus();
            v.recarregar();
            System.out.println("-----------------------------");
        }
    }
}



//import departamento.*;
//Vendedor vendedor1 = new Vendedor("Cleber", "10383072956", 50000, 2800, 60000);
//Vendedor vendedor2 = new Vendedor("Elizabeth", "10930992834", 50000, 5000, 120000);
//
//Gerente gerente = new Gerente("Robson", "38491283921", 8000, 100000, 230000);
//
//int totalVendas = vendedor1.getVendasRealizadas() + vendedor2.getVendasRealizadas();
//        gerente.setTotalVendasEquipe(totalVendas);
//
//        vendedor1.exibirDados();
//        System.out.println();
//        vendedor2.exibirDados();
//        System.out.println();
//        gerente.exibirDados();