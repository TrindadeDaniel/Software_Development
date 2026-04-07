public class App {
    public static void main(String[] args) throws Exception {
        
        Animal cavalo = new Animal("pé de pano", 1);
        System.out.println(cavalo.toString());

        ave papagaio = new ave("loro", 2, "Brasil", true);
        papagaio.setPeso(0.5f);
        System.out.println(papagaio.toString());

        ave avestruz = new ave("avestruz", 3, "África", false);
        avestruz.setPeso(140.0f);
        avestruz.setLocal("África do Sul");
        avestruz.setMigracao(false);   
        avestruz.andar();
        System.out.println(avestruz.toString());
    }
}
    