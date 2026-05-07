public class Triangulo extends Forma2D {
    private String style;
    //CONSTRUTORES
    public Triangulo() {
        super();
        style = "nada";
    }

    Triangulo(String s, double W, double H) {
        super(W, H, "Triangulo");
        this.style = s;
    }

    public Triangulo(double x, String nome, String style) {
        super(x, nome);
        this.style = style;
    }

    //getters e setters

    public String getStyle() {return style;}
    public void setStyle(String style) {this.style = style;}

    //métodos abstratos
    @Override
    public double area() {
        return getAltura() * getLargura() / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [style=" + style +
         ", getAltura()=" + getAltura() + 
         ", getLargura()=" + getLargura() + 
         ", getNome()=" + getNome() + "]";
    }

    
    

    

    
    
}
