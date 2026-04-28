import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Polimorfismo com Animais --->\n");
        Animal animais[] = new Animal[10];
        Scanner sc = new Scanner(System.in);
        Animal cachorro = new Animal("Golden Retriver", 4, 4.5, 0);
        // inserindo objeto a posição do Array
        animais[0] = cachorro;
        // animais[0].mover();
        System.out.println();
        Animal Peixe = new Peixe("Cachorra", 0, 6.7, 0, 1);
        animais[1] = Peixe;
        Animal Ave = new Ave("Pombo", "Cidade", false);
        animais[2] = Ave;
        Animal Anfíbio = new Anfíbio("Sapinho", 4, 1.2, 0, "Úmida");
        animais[3] = Anfíbio;
        // animais[1].mover();
        /*
         * for (Animal a : animais) {
         * if (a != null) {
         * a.mover();
         * }
         * }
         */

        ArrayList<Animal> listaAnimais = new ArrayList<>();
        String menu = "1 - Cadastrar animal" +
                "\n2 - Listar animais" +
                "\n3 - Mover animais" +
                "\n4 - Editar animal" +
                "\n5 - Sair";
            int option = 0;
            do{
                System.out.println(menu);
                option = sc.nextInt();
                switch (option) {
                    case 1:

                        System.out.println("-----Cadastro de Animais-----\n");
                        System.out.println("Escolha qual animal deseja cadastrar:\n " + 
                            "1 - Animal Terrestre\n " +
                            "2 - Peixe\n " +
                            "3 - Ave\n " +
                            "4 - Anfíbios\n ");
                            int tipoAnimal = sc.nextInt();
                            System.out.println("Informe o nome do animal:\n");
                            String nome = sc.next();
                            System.out.println("Informe o numero de patas do animal:\n");
                            int patas = sc.nextInt();
                            System.out.println("Informe qual a velocidade do animal:\n");
                            double velocidade = sc.nextDouble();
                            System.out.println("Informe um valor para a localização do animal:\n");
                            int localização = sc.nextInt();
                            //Especificações
                            switch (tipoAnimal) {
                                case 1:
                                    Animal a = new Animal(nome, patas, velocidade, localização);
                                    listaAnimais.add(a);
                                    
                                    break;
                            
                                case 2:
                                    System.out.println("Digite qual o tipo de agua que o peixe vive " +
                                                        "0 - agua doce \n" + "1 - agua salgada\n ");
                                    int agua = sc.nextInt();
                                    Peixe = new Peixe(nome, patas, velocidade, localização, agua);
                                    listaAnimais.add(Peixe);
                                    case 3:
                                        Ave passaro = new Ave(nome, nome, false);
                                        listaAnimais.add(Ave);

                                default:
                                    break;
                            }
                            System.out.println("Temos " + listaAnimais.size() + " animais cadastrados\n");
                        break;
                
                    case 2:

                        System.out.println("-----Lista de Animais-----");
                        for (Animal animalI : listaAnimais) {
                            System.out.println(animalI.toString());
                            
                        }
                    break;

                    case 3:

                    System.out.println("-----Mover Animal-----");
                    for(Animal a: listaAnimais){
                        a.mover();
                    }

                    break;

                    case 4:

                    System.out.println("-----Editar Animal-----");

                    break;

                    case 5:

                    System.out.println("Encerrando Sistema...");

                    break;

                    default:

                        break;
                }
            }while (true);
                
            
        
    


























        /*do {

          * System.out.println("1 - Cadastrar animal" +
                   "\n2 - Listar animais" +
                    "\n3 - Mover animais" +
                    "\n4 - editar animal" +
                    "\n5 - Sair");
            int escolha = sc.nextInt();
            System.out.println("-----------------------------");
            switch (escolha) {
                case 1:
                    do {
                        System.out.println("digite o tipo do animal que deseja cadastrar: " +
                                "\n1 - Cachorro" +
                                "\n2 - Peixe" +
                                "\n3 - Ave" +
                                "\n4 - Anfíbio");
                        int tipoAnimal = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer
                        if (tipoAnimal < 1 || tipoAnimal > 4) {
                            System.out.println("Tipo de animal inválido. Tente novamente.");
                            continue;
                        }
                        System.out.println("Digite o nome do animal: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a velocidade do animal: ");
                        double velocidade = sc.nextDouble();
                        sc.nextLine(); // Limpar o buffer
                        System.out.println("Digite a localização do animal: ");
                        int localização = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer
                        switch (tipoAnimal) {
                            case 1:
                                Animal cachorroNovo = new Animal(nome, 4, velocidade, localização);
                                for (int i = 0; i < animais.length; i++) {
                                    if (animais[i] == null) {
                                        animais[i] = cachorroNovo;
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Digite a quantidade de água necessária para o peixe: ");
                                int agua = sc.nextInt();
                                sc.nextLine(); // Limpar o buffer
                                Peixe peixeNovo = new Peixe(nome, 0, velocidade, localização, agua);
                                for (int i = 0; i < animais.length; i++) {
                                    if (animais[i] == null) {
                                        animais[i] = peixeNovo;
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Digite o local onde a ave vive: ");
                                String local = sc.nextLine();
                                System.out.println("A ave é migratória? (true/false): ");
                                boolean migracao = sc.nextBoolean();
                                sc.nextLine(); // Limpar o buffer
                                Ave aveNova = new Ave(nome, local, migracao);
                                for (int i = 0; i < animais.length; i++) {
                                    if (animais[i] == null) {
                                        animais[i] = aveNova;
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Digite o tipo de pele do anfíbio: ");
                                String tipoPele = sc.nextLine();
                                Anfíbio anfibioNovo = new Anfíbio(nome, 4, velocidade, localização, tipoPele);
                                for (int i = 0; i < animais.length; i++) {
                                    if (animais[i] == null) {
                                        animais[i] = anfibioNovo;
                                        break;
                                    }
                                }
                                break;
                        }
                    } while (false);
                    break;
                case 2:
                    for (Animal a : animais) {
                        if (a != null) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 3:
                    for (Animal a : animais) {
                        if (a != null) {
                            a.mover();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do animal que deseja editar: ");
                    String nomeEditar = sc.next();
                    boolean encontrado = false;
                    for (Animal a : animais) {
                        if (a != null && a.getNome().equalsIgnoreCase(nomeEditar)) {
                            System.out.println("Digite o novo nome do animal: ");
                            String novoNome = sc.next();
                            a.setNome(novoNome);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Animal não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (true);*/
    

    }

}
