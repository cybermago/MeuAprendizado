package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs{
    private String nome;
    private Set<Conteudo> conteudo = new LinkedHashSet<>();
    private Set<Conteudo> conteudoconcluido = new LinkedHashSet<>();

    public void inscrever(Bootcamp bootcamp){
        this.conteudo.addAll(bootcamp.getConteudos());
        bootcamp.getDevsinscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudo.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoconcluido.add(conteudo.get());
            this.conteudo.remove(conteudo.get());
        }else{
            System.err.println("Voce não está matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
       return  this.conteudoconcluido.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    public Set<Conteudo> getConteudoconcluido() {
        return conteudoconcluido;
    }

    public void setConteudoconcluido(Set<Conteudo> conteudoconcluido) {
        this.conteudoconcluido = conteudoconcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudo, devs.conteudo) && Objects.equals(conteudoconcluido, devs.conteudoconcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudo, conteudoconcluido);
    }
}