/*import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Forma2D> formas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n=== Menu de Formas 2D ===");
            System.out.println("1 - Cadastrar forma 2D");
            System.out.println("2 - Listar formas cadastradas");
            System.out.println("3 - Calcular Área");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de forma:");
                    System.out.println("1 - Triângulo");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Círculo");
                    System.out.print("Opção: ");
                    int tipoForma = sc.nextInt();
                    sc.nextLine();

                    switch (tipoForma) {
                        case 1:
                            System.out.print("Digite o estilo do triângulo: ");
                            String style = sc.nextLine();
                            System.out.print("Digite a base do triângulo: ");
                            double base = sc.nextDouble();
                            System.out.print("Digite a altura do triângulo: ");
                            double alturaTriangulo = sc.nextDouble();
                            sc.nextLine();
                            Forma2D triangulo = new Triangulo(style, base, alturaTriangulo);
                            formas.add(triangulo);
                            System.out.println(
                                    "Triângulo cadastrado: " + triangulo.getNome() + " | Área: " + triangulo.area());
                            break;
                        case 2:
                            System.out.print("Digite a largura do retângulo: ");
                            double largura = sc.nextDouble();
                            System.out.print("Digite a altura do retângulo: ");
                            double alturaRetangulo = sc.nextDouble();
                            sc.nextLine();
                            Forma2D retangulo = new Retangulo(largura, alturaRetangulo, "Retângulo");
                            formas.add(retangulo);
                            System.out.println(
                                    "Retângulo cadastrado: " + retangulo.getNome() + " | Área: " + retangulo.area());
                            break;
                        case 3:
                            System.out.print("Digite o raio do círculo: ");
                            double raio = sc.nextDouble();
                            sc.nextLine();
                            Forma2D circulo = new Circulo(raio, "Círculo");
                            formas.add(circulo);
                            System.out
                                    .println("Círculo cadastrado: " + circulo.getNome() + " | Área: " + circulo.area());
                            break;
                        case 4:
                            System.out.println("voltar ao menu principal...");
                            return;
                        default:
                            System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n=== Formas Cadastradas ===");
                    if (formas.isEmpty()) {
                        System.out.println("Nenhuma forma cadastrada.");
                    } else {
                        for (Forma2D forma : formas) {
                            System.out.println(forma.toString() + " | Área: " + forma.area());
                        }
                    }
                    break;
                case 3:
                    System.out.println("=== Calculando a Área ===");
                    System.out.println("Informe o valor para calcular a área\n");
                    sc.nextDouble();
                    //raio = getAltura();
                   // resultado = (Math.PI * raio) * raio;

                case 4:
                    System.out.println("Saindo do Sistema...");
                    sc.close();

                    

            }

        } while (opcao != 0);
    }

}*/