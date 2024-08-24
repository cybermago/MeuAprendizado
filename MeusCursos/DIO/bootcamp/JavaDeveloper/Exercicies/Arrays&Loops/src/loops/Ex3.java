package loops;

import java.util.Map;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int maior = 0;
        int media;
        int soma=0;

            do{
                System.out.println("Número: ");
                num = sc.nextInt();

                soma += num;
                if(num > maior) maior = num;
                i++;
            }while(i < 5);
        System.out.println(+maior);
        System.out.println(+soma/5);
    }
}