public class calculadora {
    private int valor1;
    private int valor2;

    // get e set

    public int getValor1() {
        return this.valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return this.valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    // métodos
    public int soma() {
        return this.valor1 + this.valor2;
    }

    public int subtracao() {
        return this.valor1 - this.valor2;
    }

    public int multiplicacao() {
        return this.valor1 * this.valor2;
    }

    public double divisao() {
        return (double) this.valor1 / this.valor2;
    }


    public String toString(){
        return "Valor 1: " + this.valor1 + "\nValor 2: " + this.valor2;
    }
}
