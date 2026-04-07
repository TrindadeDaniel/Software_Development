public class ave extends Animal {

    private String local;
    private boolean migracao;


    public ave() {}
    public ave(String nome, int recinto, String local, boolean migracao) {
        super(nome, recinto);
        this.local = local;
        this.migracao = migracao;
    }

    public String getLocal() {return local;}
    public void setLocal(String local) {this.local = local;}

    public boolean isMigracao() {return migracao;}
    public void setMigracao(boolean migracao) {this.migracao = migracao;}

    @Override //sobrescreve o método andar da classe mãe
    public void andar() {
        //int novoValor = getRecinto() + 2;
        //setRecinto(novoValor);
        System.out.println("A ave está voando...");
        setRecinto(getRecinto() + 2);
    }

    public String toString() {
        return "Ave" + "\t [local= " + local
                + "\t migracao= " + migracao
                + "getNome()= " + getNome()
                + "\t getRecinto()= " + getRecinto()
                + "\t getPeso()= " + getPeso() + "]";
    }

    

    

}
