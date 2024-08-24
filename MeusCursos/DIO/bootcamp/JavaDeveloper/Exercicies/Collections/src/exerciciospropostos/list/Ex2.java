package exerciciospropostos.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ex2> pergunta = new ArrayList<>(){{
            add(new Ex2("Telefonou para a vítima?:"));
            add(new Ex2("Esteve no local do crime?:"));
            add(new Ex2("Mora perto da vítima?:"));
            add(new Ex2("Devia para a vítima?:"));
            add(new Ex2("Já trabalhou com a vítima?:"));
        }};
        int resposta=0;
        int count = 0;
        System.out.println("Responda as perguntas: 1-sim/0-não");

        for (Ex2 perguntas : pergunta){
            System.out.println(perguntas.getPergunta());
            resposta = sc.nextInt();

            while(resposta != 1 && resposta != 0){
                System.out.println("Invalido");
                resposta = sc.nextInt();
            }
            if(resposta == 1){
                count++;
            }

        }

        if (count == 2){
            System.out.println("Suspeito");
        } else if( count == 3 || count == 4){
            System.out.println("Cumplice");
        } else if (count == 5) {
            System.out.println("Assasino");
        }  else {
            System.out.println("Inocente");
        }

        sc.close();
    }

    private String pergunta;

    public Ex2(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "Ex2{" +
                "pergunta='" + pergunta + '\'' +
                '}';
    }
}
