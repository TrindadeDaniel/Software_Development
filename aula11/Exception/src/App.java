import java.io.IOException;

public class App {
    public void m() throws IOException {
        throw new IOException("erro de dispositivo!!!");
    }

    public static void main(String[] args) throws Exception {
        try {
            // int myNumbers[] = { 1, 2, 3 };
            // System.out.println(myNumbers[10]); // 10 para dar Exception
            App app = new App();
            app.m();
        } catch (IOException ex) {
            System.out.println("tratando exceção específica --->\n  ");
        } catch (Exception e) {
            System.out.println("algo de errado não está certo\n" + e.getMessage());
            e.printStackTrace();
            System.out.println("toString da Exeção! \n " + e.toString());
        } finally {
            System.out.println("o try catch Terminou");
        }
    }
}
