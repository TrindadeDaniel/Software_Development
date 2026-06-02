import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        FileReader fl = new FileReader("src/cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fl);
        String line = null;
        br.readLine(); // descarta linha 1 e le a primeira linha (cabeçalho) do arquivo
        while ((line = br.readLine()) != null) {
            String dados[] = line.split(";");// quebra a linha em um array de String usando o ; como separador
            System.out.println(dados[1]);
            Pessoa p = new Pessoa(dados[0], dados[1], dados[2]);
            pessoas.add(p);
        }

        br.close();
        System.out.println("pessoas cadadastradas no sistema!:");
        Pessoa p2 = new Pessoa("Maria das Neves", "000000000", "21/08/1999");
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/cadastro_pessoas.csv", true));
        bw.newLine();
        bw.write(p2.toString());
        bw.close();
    }
}

/*
 * Pessoa p1 = new Pessoa("João  Oliveira", "00000000", "09/010/1996");
 * Pessoa p2 = new Pessoa("Maria das Neves", "000000000", "21/08/1999");
 * Pessoa p3 = new Pessoa("Eliane Ferrarezi", "000000000", "12/03/1992");
 * pessoas.add(p1);
 * pessoas.add(p2);
 * pessoas.add(p3);
 * 
 * System.out.println("ArrayList ordenada:\n" + pessoas);
 * Collections.sort(pessoas);
 * System.out.println("\nArrayList ordenada:\n" + pessoas);
 * 
 * //busca binária
 * Pessoa p4 = new Pessoa("André Silva", "000000000", "21/08/1999");
 * System.out.println("\nBusca binária por: " +
 * p4.getNome() + " : " + Collections.binarySearch(pessoas, p4));
 * 
 * Pessoa p5 = new Pessoa("Joao Ribeiro", "000000000", "23/03/2017");
 * Pessoa p6 = new Pessoa("Daniel Henrique", "000000000", "23/03/2007");
 * Pessoa p7 = new Pessoa("Adriam Almeida", "000000000", "17/03/2007");
 * 
 * ArrayList<Pessoa> pessoas2 = new ArrayList<>();
 * pessoas2.add(p5);
 * pessoas2.add(p6);
 * pessoas2.add(p7);
 * 
 * Collections.sort(pessoas2);
 * System.out.println("Conjuntos disjuntos?:\n" + Collections.disjoint(pessoas,
 * pessoas2));
 * 
 * pessoas2.add(p1);
 * System.out.println("depois de add p1 em pessoas2: " +
 * Collections.disjoint(pessoas, pessoas2));
 * 
 * System.out.println("frequencia de nome: " +p1.getNome() +
 * Collections.frequency(pessoas, p1));
 * 
 * Collections.reverse(pessoas2);
 * System.out.println("pessoas2 reversa: " + pessoas2);
 */
