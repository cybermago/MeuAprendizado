package intermediate;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos valores de entrada
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        // Verificação se os valores formam um triângulo
        boolean formaTriangulo = (A + B > C) && (A + C > B) && (B + C > A);

        if (formaTriangulo) {
            // Se formar um triângulo, calcular o perímetro
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            // Caso contrário, calcular a área do trapézio
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        leitor.close();
    }
}
