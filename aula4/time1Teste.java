package aula4;

public class time1Teste {

    public static void main(String[] args) {
        time1 time = new time1();

        System.out.print(" initial universal value of time: ");
        System.out.println(time.toUniversalString());

        System.out.print("Value default initial of time: ");
        System.out.println(time.toString() + "\n");

        time.setTime(13, 27, 6);
        System.out.print("universal value after setTime: ");
        System.out.println(time.toUniversalString());

        System.out.print("value default after of setTime: ");
        System.out.println(time.toString());

    }

}
