public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Polimorfismo com Animais --->\n");
        Animal animais[] = new Animal[10];

        Animal cachorro = new Animal("Golden Retriver", 4, 4.5, 0);
        // inserindo objeto a posição do Array
        animais[0] = cachorro;

        //animais[0].mover();
        System.out.println();

        Animal Peixe = new Peixe("Cachorra", 0, 6.7, 0, 1);
        animais[1] = Peixe;

        Animal Ave = new Ave("Pombo", "Cidade", false);
        animais[2] = Ave;




       //animais[1].mover();

        for(Animal a: animais){
           if (a != null) {
            a.mover();
           } 
        }

    }
}
