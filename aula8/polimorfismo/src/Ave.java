public class Ave extends Animal {

    private String local;
    private boolean migracao;


    public Ave() {}
    public Ave(String nome, String local, boolean migracao) {
        super(nome, 2, 0.5, 0);
        this.local = local;
        this.migracao = migracao;
    }

    public String getLocal() {return local;}
    public void setLocal(String local) {this.local = local;}

    public boolean isMigracao() {return migracao;}
    public void setMigracao(boolean migracao) {this.migracao = migracao;}

    @Override //sobrescreve o método andar da classe mãe
    public void mover() {
        //int novoValor = getRecinto() + 2;
        //setRecinto(novoValor);
        System.out.println("A ave está voando...");
        setLocalização(getLocalização() + 2);
    }

    public String toString() {
        return "Ave" + "\t [local= " + local
                + "\t migracao= " + migracao
                + "getNome()= " + getNome()
                + "\t getPatas()= " + getPatas()
                + "\t getVelocidade()= " + getVelocidade()
                + "\t getLocalização()= " + getLocalização() + "]";
    }

}