package basic;

import java.util.Scanner;

import static java.lang.Math.round;

public class Desafio3 {
    public static void main(String[] args) {

            double h = 0;
            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();


            for (int i = 1; i <= n; i++) {
                //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
                h += 1.0 / i;

            }
        int result = (int) Math.round(h);
        System.out.println(result);
            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        }
    }