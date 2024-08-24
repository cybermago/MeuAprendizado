package list.exercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Double> notas2 = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        list.add(0,0.5);
        list.add(1,0.9);

        //Adicionar ArrayList dentro de um LnkedList
        notas2.add(list.getFirst());
        System.out.println(notas2);

        // - Exibir primeiro elemento
        System.out.println(list.indexOf(0));
        // - Exibir primeiro elemto removendo
        System.out.println(list.remove(0).toString());

    }
}
