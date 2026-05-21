import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        System.out.println("inteiros antes de ordenar: " + nomes);
        Collections.sort(nomes);
        System.out.println("inteiros antes de ordenar: " + nomes);

        System.out.println("Collections.binarySearch(): Otavio " + Collections.binarySearch(nomes, "Otavio"));
        System.out.println("Collections.binarySearch(): Bruno " + Collections.binarySearch(nomes, "Bruno"));

        ArrayList<String> nomes2 = new ArrayList<>();

        nomes2.add("lucas");
        nomes2.add("joão");
        nomes2.add("moisés");
        nomes2.add("Jó");
        nomes2.add("Jesus");
        String n = "josé";
        n.toUpperCase();



        System.out.println("nomes2 antes de ordenar: " + nomes2);
        Collections.sort(nomes2);
        System.out.println("nomes2 ordenado: " + nomes2);

        System.out.println("Os conjuntos não possuem valores em comum? "
                + Collections.disjoint(nomes, nomes2));

        nomes2.add("Bruno");
        System.out.println("Exibindo a frequência do valor Bruno: " + Collections.frequency(nomes2, "Bruno"));
        System.out.println("O maior valor encontrado em nomes 2 é: " + Collections.max(nomes2) 
        + "\nO menor valor encontrado em nomes 2 é: " + Collections.min(nomes2));

        //inverter o Arraylist
        Collections.reverse(nomes2);
         System.out.println("ArrayList nomes2 invertido " + nomes2);

        /*
         * System.out.println("Collections.binarySearch(10): " +
         * Collections.binarySearch(nomes ,10));
         * 
         * System.out.println("Collections.binarySearch(10): " +
         * Collections.binarySearch(inteiros ,20));//numeros negativos significam Erro.
         * //30, 52, 20, -10, 100
         * 
         * ArrayList<Integer> inteiros2 = new ArrayList<>();
         * inteiros2.add(30);
         * inteiros2.add(52);
         * inteiros2.add(20);
         * inteiros2.add(-10);
         * inteiros2.add(100);
         * System.out.println("Os conjuntos não possuem valores em comum? " +
         * Collections.disjoint(inteiros, inteiros2));
         * 
         * inteiros2.add(100);
         * System.out.println("Exibindo a frequência do valor 100: " +
         * Collections.frequency(inteiros2, 100));
         * 
         * System.out.println("o maior valor encontrado em inteiros 2 é: " +
         * Collections.max(inteiros2) + "O menor valor encontrado em inteiros 2 é: " +
         * Collections.min(inteiros2));
         * 
         * //inverter o Arraylist
         * Collections.reverse(inteiros2);
         * System.out.println("ArrayList inteiros2 invertido " + inteiros2);
         */
    }

}
