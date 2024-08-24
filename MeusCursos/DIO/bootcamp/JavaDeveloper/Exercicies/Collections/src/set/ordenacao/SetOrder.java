package set.ordenacao;

import java.util.*;

/*
* equals and hashcode
* new HashMap()
* new LinkedHashMap()
* new TreeSet()
* Comparable
* ComparatorNomeGenero
* */
public class SetOrder {
    public static void main(String[] args) {

        // - Ordem aleatoria - //
        System.out.println("\t Ordem Aleatoria \t");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Fantasia",60));
            add(new Serie("That","Comédia",25));
        }};
        for (Serie serie : series) {
            System.out.println(serie.getNome()+serie.getGenero() + serie.getTempep());
        }

        // - Ordem de Inserção - //
        System.out.println(" Ordem de Inserção");
        Set<Serie> series2 = new HashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Fantasia",60));
            add(new Serie("That","Comédia",25));
        }};
        for (Serie serie : series2) {
            System.out.println(serie.getNome()+serie.getGenero() + serie.getTempep());
        }

        // - Ordem Natural
        System.out.println("\t Ordem Natural \t");
        Set<Serie> series3 = new TreeSet<>(series);
        for(Serie serie: series3){
            System.out.println(serie.getNome() + "-" +
                    serie.getGenero() + "-"
                    + "-" +serie.getTempep());
        }
        System.out.println(series2);

        // -
        System.out.println("\t Ordem Nome/Genero/TempoEpisodio \t");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series3.addAll(series);
        for(Serie serie: series4){
            System.out.println(serie.getNome() + "-" +
                    serie.getGenero() + "-"
                    + "-" +serie.getTempep());
        }

        //desafio - ordenar por genero

        //desafio - ordenar por tipo de episodio


    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempep;

    public Serie(String nome, String genero, Integer tempep) {
        this.nome = nome;
        this.genero = genero;
        this.tempep = tempep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempep() {
        return tempep;
    }

    public void setTempep(Integer tempep) {
        this.tempep = tempep;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempep=" + tempep +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempep, serie.tempep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempep);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoep = Integer.compare(this.getTempep(), serie.getTempep());
        if(tempoep != 0) return tempoep;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {


    @Override
    public int compare(Serie o1, Serie o2) {
        int nome =  o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if(genero != 0) return genero;

        return  Integer.compare(o1.getTempep(), o2.getTempep());
    }
}
