import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Forma2D> formas = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Menu de Formas 2D ===");
            System.out.println("1 - Cadastrar forma 2D");
            System.out.println("4 - Listar formas cadastradas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    switch ()) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        default:
                            
                    }
                    break;
                case 2:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    scanner.nextLine();
                    Forma2D retangulo = new Retangulo(largura, alturaRetangulo, "Retângulo");
                    formas.add(retangulo);
                    System.out.println("Retângulo cadastrado: " + retangulo.getNome() + " | Área: " + retangulo.area());
                    break;
                case 3:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    scanner.nextLine();
                    Forma2D circulo = new Circulo(raio, "Círculo");
                    formas.add(circulo);
                    System.out.println("Círculo cadastrado: " + circulo.getNome() + " | Área: " + circulo.area());
                    break;
                case 4:
                    if (formas.isEmpty()) {
                        System.out.println("Nenhuma forma cadastrada.");
                    } else {
                        System.out.println("\nFormas cadastradas:");
                        for (Forma2D forma : formas) {
                            System.out.println("Nome: " + forma.getNome() + " | Área: " + forma.area());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do menu...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Escolha um número entre 1 e 5.");
                    break;
            }
        }
    }
}












