public class Ave extends Animal {

    
    private boolean migracao;


    public Ave() {}
    public Ave(String nome, String local, boolean migracao) {
        super(nome, 2, 0.5, 0);
        
        this.migracao = migracao;
    }

    

    public boolean isMigracao() {return migracao;}
    public void setMigracao(boolean migracao) {this.migracao = migracao;}

    @Override //sobrescreve o método andar da classe mãe
    public void mover() {
        //int novoValor = getRecinto() + 2;
        //setRecinto(novoValor);
        System.out.println("A ave está voando^^^^^^");
        setLocalização(getLocalização() + 3);
    }

    public String toString() {
        return "Ave" + "\n migracao= " + migracao +
                 "getNome: " + getNome() +
                 "\n Patas: " + getPatas() +
                 "\n Velocidade: " + getVelocidade() +
                 "\n Localização: " + getLocalização();
    }

}