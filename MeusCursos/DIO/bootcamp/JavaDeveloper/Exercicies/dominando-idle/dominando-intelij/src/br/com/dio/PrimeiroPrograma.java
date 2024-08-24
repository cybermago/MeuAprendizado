package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5, b = 6;
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("a");
        System.out.println("Hello world" + (a + b));
    }
}
    class Livro{
    private String author;

        public Livro(String author) {
            this.author = author;
        }
    }
