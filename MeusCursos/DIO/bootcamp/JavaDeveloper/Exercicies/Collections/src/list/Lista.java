package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //List<Integer> lista = new ArrayList<>();
        //ArrayList<Double> lista = new ArrayList<>();
        //List<Double> lista = new ArrayList<>(Arrays.asList(7d,1d));
        //List<Double> lista = Array.asList(7d, 8.8, 9.3);
        //List<Double> lista = List.of(7d, 8.9); //lista imutavel

        List<Double> lista = new ArrayList<Double>();
        lista.add(0, 1.5);
        lista.add(1, 2.8);
        lista.add(2, 3.9);
        lista.add(3, 4.1);
        lista.add(4, 5.4);
        lista.add(5, 6.6);
        lista.add(6, 7.4);

        // - Retornar Lista
        System.out.println(lista.toString());
        // - Retornar posição de um item
        System.out.println(lista.indexOf(5d));
        // - Adicionar item na posição 4
        lista.add(4, 8.9);
        // - Substitur item na posição 5
        lista.set(lista.indexOf(5d), 6.4);
        // - Conferir se items está na lista
        System.out.println(lista.contains(5d));
        // - Exibir na ordem informada
        for (double listas : lista) {System.out.println(lista);}
        // - Retornar elemento na posição 2
        System.out.println(lista.get(2));
        // - Retornar menor elemento
        System.out.println(Collections.min(lista));
        // - Retornar maior elemento
        System.out.println(Collections.max(lista));

        // - Soma entre os elementos da lista;
        Iterator<Double> iterator = lista.iterator();
        double soma = 0d;
        while (iterator.hasNext()) { //hasNext cursor do proximo item
            double next = iterator.next();
            soma += next;
        }
        System.out.println("soma: " + soma);

        // - Média entre os elementos da lista
        System.out.println("media: " + (soma / lista.size()));

        // - Remover elemento ou elemento do indice
        lista.remove(0);
        lista.remove(0d);

        // - Remover elementos menores que um certo item
        Iterator<Double> iterator2 = lista.iterator();
        while (iterator2.hasNext()) {
            double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(lista);

        // - Limpar Lista
        lista.clear();
        // - Conferir se a lista está vazia
        System.out.println(lista.isEmpty());

    }
}