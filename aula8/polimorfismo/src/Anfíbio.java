class Anfíbio extends Animal {

    private String tipoPele;

    public Anfíbio(String nome, int patas, double velocidade, int localização, String tipoPele) {
        super(nome, patas, velocidade, localização);
        this.tipoPele = tipoPele;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    @Override
    public void mover() {
        System.out.println(" O " + getNome() + " está se movendo...");
        setLocalização(getLocalização() + 1);
    }

    @Override
    public String toString() {
        return "Tipo Pele: " + tipoPele +
               "\n Nome: " + getNome() +
               "\n Patas: " + getPatas() +
               "\n Velocidade: " + getVelocidade() +
               "\n Localização: " + getLocalização();}

    












}