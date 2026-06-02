public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    // CRONSTRUTORES

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
         ", cpf = " + cpf +
         ", dataDeNascimento = " + dataDeNascimento + "\n";
    }

    @Override
    public int compareTo(Pessoa outra) {
        return nome.compareTo(outra.nome);

    }

}