import java.util.Scanner;

public class Bicicleta implements Veiculo {
    Scanner sc = new Scanner(System.in);
    private boolean pista;

    // Getters e setters para a variável pista

    public boolean getPista() {
        return pista;
    }

    public void setPista(boolean pista) {

        this.pista = pista;
    }

    // Construtor para inicializar a variável pista

    public Bicicleta(boolean pista) {
        this.pista = pista;
    }

    // Implementação dos métodos da interface Veiculo

    @Override
    public void acelerar() {
        System.out.println("Pedalando mais rapido.");
    }

    @Override
    public void frear() {
        System.out.println("Acionando o freio traseiro.");
    }

    @Override
    public String obterTipo() {
        System.err.println();
        return "bicicleta";
    }

    public void verificarPista() {
        System.out.println("A bicicleta está na pista? (true/false)");
        boolean resposta = sc.nextBoolean();
        setPista(resposta);
        if (resposta) {
            System.out.println("A bicicleta está na pista.");
        } else {
            System.out.println("A bicicleta não está na pista.");
        }
    }

}
