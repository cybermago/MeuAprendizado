package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a=0,b=0;
        int soma = soma(a,b);

        System.out.println("1:");
        a = sc.nextInt();
        System.out.println("2:");
        b = sc.nextInt();
        System.out.println(soma);

    }

    public static int soma(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a+b;
    }    public static int multi(int a, int b){
        return a+b;
    }    public static int div(int a, int b){
        return a+b;
    }
}
