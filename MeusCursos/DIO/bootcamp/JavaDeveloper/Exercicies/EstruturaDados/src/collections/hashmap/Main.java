package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome","João");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> alunos = new ArrayList<>();

        aluno.put("Nome","João");
        aluno.put("Nome2","Maria");

        System.out.println(alunos);
        System.out.println(aluno.containsKey("Nome2"));

    }
}