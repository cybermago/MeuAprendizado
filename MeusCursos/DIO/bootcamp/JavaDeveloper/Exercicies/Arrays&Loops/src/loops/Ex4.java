package loops;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int num = 0; int qtdnum=0;int qtdpar=0;int qtdimpar=0;
        int i=0;
        System.out.println("Digite: "); qtdnum = sc.nextInt();

        do {
            System.out.println("Número: ");
            num = sc.nextInt();
            if (num % 2 == 0) qtdpar++;
            else qtdimpar++;
            i++;
        }while (i < qtdnum);
        System.out.println(+qtdpar);
        System.out.println(+qtdimpar);
        sc.close();
    }
}
