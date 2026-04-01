package aula4;
import java.util.Scanner;
public class time2Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        time2 t1 = new time2();

        time2 t2 = new time2(20);

        time2 t3 = new time2(20, 45);

        time2 t4 = new time2(t3);

       System.out.print(" initial universal value of time: ");
        System.out.println(t1.toUniversalString());

        System.out.print("Value default initial of time: ");
        System.out.println(t1.toString() + "\n");

        System.out.print(" initial universal value of time: ");
        System.out.println(t2.toUniversalString());

        System.out.print("Value default initial of time: ");
        System.out.println(t2.toString() + "\n");

        System.out.print(" initial universal value of time: ");
        System.out.println(t3.toUniversalString());

        System.out.print("Value default initial of time: ");
        System.out.println(t3.toString() + "\n");

        System.out.print(" initial universal value of time: ");
        System.out.println(t4.toUniversalString());
        
    }

}