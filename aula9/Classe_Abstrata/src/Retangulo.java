public class Retangulo extends Forma2D {
    public Retangulo() {
       super(); 
    }

    public Retangulo(double largura, double altura, String nome) {
        super(largura, altura, nome);
    }

    public Retangulo(double x, String nome) {
        super(x, nome);
    }

    @Override
    public double area() {
        return getAltura() * getLargura();
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + getAltura() + ", largura=" + getLargura() + ", nome=" + getNome() + "]";
    }
}
