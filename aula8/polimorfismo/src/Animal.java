public class Animal {
    private String nome;
    private int patas;
    private double velocidade;
    private int localização;

    
    public Animal(String nome, int patas, double velocidade, int localização) {
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
        this.localização = localização;
    }

    public Animal(){}


    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getLocalização() {
        return localização;
    }

    public void setLocalização(int localização) {
        this.localização = localização;
    }

    public void mover(){
        System.out.println( this.nome  + " está se movendo ---->");
        this.localização++;
    }

    @Override
    public String toString() {
        return "Animal [nome=" 
                + nome + ", patas=" 
                + patas + ", velocidade=" 
                + velocidade + ", localização="
                + localização + "]";
    }

    

}
