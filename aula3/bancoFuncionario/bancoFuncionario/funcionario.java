public class funcionario {
    String nome, dtEntrada, departamento, rg;
    boolean status;
    double salario;


    void bonifica(double aumento){
        this.salario +=aumento;
    }

    void demissao(){
        this.status = false;
    }

    void dados(){
        String status = this.status? " sim ":" Não ";

        String ficha= """
       ========================
         FICHA DO FUNCIONÁRIO
       ========================
        |Nome: %s|
        |RG: %s|
        |Departamento: %s|
        |Salário: %s|
        |Data de entrada: %s|
        |Status: %s|
                """. formatted(this.nome, this.departamento, this.salario, this.dtEntrada,this.rg, this.status);
    }
}

 /*void dados(){
        System.out.println("\n -- Dados do funcionario -- \n");
        System.out.println("Nome: " + this.nome );*/
































