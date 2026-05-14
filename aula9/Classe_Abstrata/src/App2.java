import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("----- CLASSES E MÉTODOS ABSTRATOS ----- \n");
        ArrayList<Forma2D> listForm = new ArrayList<>();
        MenuFormas menuFormas = new MenuFormas();
        int option = 0;
    
        do {
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
                    listForm.add(menuFormas.cadaFormas2d());
                    break;

                case 2:
                    // Listar forma
                    break;

                case 3:
                    break;
            
                default:
                    break;
            }
        } while (option !=0);
        menuFormas.encerraSistema(); // encerra o scanner
    }
}