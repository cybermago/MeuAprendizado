package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOrder extends Gato {

    public ListOrder(String nome, String cor, int idade) {
        super(nome, cor, idade);
    }

    public static void main(String[] args) {
        List<ListOrder> cats = new ArrayList<>(){{
            add(new ListOrder("jhon", "preto", 1));
            add(new ListOrder("simba", "tigrado", 6));
            add(new ListOrder("Jon", "amarelo", 1));
        }};

        System.out.println("\tOrdem de Inserção\t");
        System.out.println(cats);

        System.out.println("\tOrdem Aleatoria\t");
        Collections.shuffle(cats);
        System.out.println(cats);

        System.out.println("\tOrden Natural\t");
        Collections.sort(cats);
        System.out.println(cats);

        System.out.println("\tOrdem Idade\t");
        //Collections.sort(cats, new ComparatorIdade());
        cats.sort(new ComparatorIdade());
        System.out.println(cats);

        System.out.println("\tOrdem Cor\t");
        //Collections.sort(new ComparatorIdade());
        cats.sort(new ComparatorIdade());
        System.out.println(cats);

        System.out.println("\tOrdem Nome/Cor/Idade\t");
        cats.sort(new ComparatorNomeCorIdade());
        System.out.println(cats);

    }
}

class Gato implements Comparable<Gato>{

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato> {
@Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}