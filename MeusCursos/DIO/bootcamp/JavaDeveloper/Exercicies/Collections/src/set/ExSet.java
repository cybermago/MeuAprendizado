package set;

import java.util.*;
/*
* toString()
* contains()
* get()
* Collections.min()
* Collections.max()
* iterator()
* iterator.hasNext
* iterator.next()
* size()
* remove()
* iterator().remove()
* new LinkedHashMap()
* new TreeSet()
* */

public class ExSet {
    public static void main(String[] args) {
        //Set nota = new HashSet();
        //Set<Double> notas = new HashSet<>();
        //HashSet<Double> notas  new HashSet();
        //Set<Double> notas = new HashSet<>(Arrays.asList());
        //Set<Double> notas = Set.of();


        Set<Double> notas = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //posisão não tem
        //substiuição não tem
        //Conferir se contem
        System.out.println(""+notas.contains(5d));
        //exibir valor nao tem
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        //Soma dos valores
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        // - Média
        System.out.println(soma/ notas.size());
        // - Remover
        notas.remove(0d);
        System.out.println();
        // - Rmover elementos menores
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);
        // - LinkedHashSet Ordem de Inserção- //
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        // - LinkedHashSet - //
        // - TreeSet Ordem Natural- //
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        // - Apagar conjunto
        notas.clear();
        // - Conferir se está vazio
        System.out.println(notas.isEmpty());
        System.out.println(notas2.isEmpty());
        System.out.println(notas3.isEmpty());
        // - TreeSet - //
    }
}