import java.util.ArrayList;
import java.util.Collections;

public class ArrayInteiros {
 public static void main(String[] args) throws Exception {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);
        System.out.println("inteiros antes de ordenar: " + inteiros);
        Collections.sort(inteiros);
        System.out.println("inteiros antes de ordenar: " + inteiros);
        System.out.println("Collections.binarySearch(10): " + Collections.binarySearch(inteiros ,10));

        System.out.println("Collections.binarySearch(10): " + Collections.binarySearch(inteiros ,20));//numeros negativos significam Erro.
        //30, 52, 20, -10, 100

        ArrayList<Integer> inteiros2 = new ArrayList<>();
         inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);
        System.out.println("Os conjuntos não possuem valores em comum? " + Collections.disjoint(inteiros, inteiros2));

        inteiros2.add(100);
        System.out.println("Exibindo a frequência do valor 100: " + Collections.frequency(inteiros2, 100));

        System.out.println("o maior valor encontrado em inteiros 2 é: " + Collections.max(inteiros2) + "O menor valor encontrado em inteiros 2 é: " + Collections.min(inteiros2));

        //inverter o Arraylist
        Collections.reverse(inteiros2);
        System.out.println("ArrayList inteiros2 invertido " + inteiros2);
    }

}
