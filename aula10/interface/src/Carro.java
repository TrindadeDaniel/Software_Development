import java.util.Scanner;

public class Carro implements Veiculo {
    private String modelo;

    // Getters e setters para o modelo do carro

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Construtor para inicializar o modelo do carro

    public Carro(String string) {
        this.modelo = string;
    }

    // Implementação dos métodos da interface Veiculo

    @Override
    public void acelerar() {
        System.out.println("qual a velocidade que deseja acelerar?");
        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();
        System.out.println("O carro está acelerando.");
        sc.close();
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }

    @Override
    public String obterTipo() {
        System.out.println("Digite o modelo do carro:");
        return null;
    }

}
