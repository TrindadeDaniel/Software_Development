import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option = 5;
        calculadora calc = new calculadora();

        do {
            System.out.println("Calculadora"
                    + "\n1 - Soma"
                    + "\n2 - Subtração"
                    + "\n3 - Multiplicação"
                    + "\n4 - Divisão"
                    + "\n5 - Sair");
            option = sc.nextInt();
            if (option == 5) {
                System.out.println("Digite o valor inteiro:");
                calc.setValor1(sc.nextInt());
                System.out.println("Digite OUTRO valor inteiro:");
                calc.setValor2(sc.nextInt());
            }
            switch (option) {
                case 1:
                    System.out.println("Resultado - Soma");
                    System.out.println(calc.getValor1() + " + " + calc.getValor2() + " = " + calc.soma());
                    break;

                case 2:
                    System.out.println("Resultado - Subtração");
                    System.out.println(calc.getValor1() + " - " + calc.getValor2() + " = " + calc.subtracao());
                    break;
                case 3:
                    System.out.println("Resultado - Multiplicação");
                    System.out.println(calc.getValor1() + " * " + calc.getValor2() + " = " + calc.multiplicacao());
                    break;
                case 4:
                    System.out.println("Resultado - Divisão");
                    if (calc.getValor1() != 0 && calc.getValor2() != 0) {
                        System.out.println(calc.getValor1() + " / " + calc.getValor2() + " = " + calc.divisao());
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (option != 5);
        sc.close();

    }

}
