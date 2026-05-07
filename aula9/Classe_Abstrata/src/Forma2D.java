public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;

    public Forma2D() {
        this.altura = this.largura = 0.0;
        this.nome = "nada";
    }

    public Forma2D(double W, double H, String n) {
        this.altura = H;
        this.largura = W;
        this.nome = n;
    }
    //todos os lados iguais - CONSTRUTOR
    public Forma2D(double x, String nome) {
        this.altura = this.largura = x;
        this.nome = nome;
    }


    // getters e setters
    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //métodos abstratos
    public abstract double area();

    @Override
    public String toString() {
        return "Forma2D [altura=" + altura +
                ", largura=" + largura +
                ", nome=" + nome + "]";
    }

}
