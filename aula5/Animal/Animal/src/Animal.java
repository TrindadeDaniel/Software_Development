public class Animal {

    private String nome;
    private float peso;
    private int recinto;

    public Animal(String nome, int recinto) {
        this.nome = nome;
        this.recinto = recinto;
        this.peso = 0.0f;
    }

    public Animal(){}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    public int getRecinto() {return recinto;}
    public void setRecinto(int recinto) {this.recinto = recinto;}


    public void andar() {
        this.recinto++;
    }

    

    @Override
    public String toString() {
     return "Animal" + "\t nome= " + nome
                     + "\t peso= " + peso
                     + "\t recinto= " + recinto;}
}