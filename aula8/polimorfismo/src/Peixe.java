public class Peixe extends Animal {
    private int agua;

    public Peixe(String nome, int patas, double velocidade, int localização, int agua) {
        super(nome, patas, velocidade, localização);
        this.agua = agua;
    }

    //GET E SET
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public void mover(){
        System.out.println("peixe " + getNome() + " está nadando ~~~~~~~~");
        setLocalização(getLocalização() + 2);
    }

    @Override
    public String toString() {
        return "Peixe agua: " + agua +
             "\nNome: " + getNome() +
              "\n Velocidade: " + getVelocidade() +
             "\n getLocalização: " + getLocalização();
    }

    

    
    

    





}
