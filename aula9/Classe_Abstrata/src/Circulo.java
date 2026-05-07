public class Circulo extends Forma2D {

    public Circulo() {
        super();
    }

    public Circulo(double raio, String nome) {
        super(raio, nome);
    }

    @Override
    public double area() {
        double raio = getAltura(); // ou getLargura(), ambos são iguais
        return (Math.PI * raio) * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + getAltura() + ", nome=" + getNome() + "]";
    }

}
