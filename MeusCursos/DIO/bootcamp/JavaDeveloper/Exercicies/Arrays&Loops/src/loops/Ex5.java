package loops;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Tabuada");
        int tabuada = sc.nextInt();

        System.out.println(+tabuada);

        for(int i = 0; i < 10; i++){
        i++;
            System.out.println(tabuada+ "X" +i + "=" + (tabuada*i));
        }

        sc.close();
    }
}
