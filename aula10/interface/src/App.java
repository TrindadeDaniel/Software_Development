import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro("Fusca"));
        System.out.println("digite o tipo de bicicleta:");
        Scanner sc = new Scanner(System.in);
        // instanciando e lendo o parametro simultaneamente
        listaVeiculos.add(new Bicicleta(sc.nextBoolean()));
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.acelerar();
            veiculo.frear();
            System.out.println(veiculo.obterTipo());
        }
        sc.close();

    }
}
