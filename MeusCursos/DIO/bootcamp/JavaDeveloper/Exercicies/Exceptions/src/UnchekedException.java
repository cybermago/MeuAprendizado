import javax.swing.*;
import java.io.IOException;

public class UnchekedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador:");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado:" + resultado);
            }catch (NumberFormatException e){
                JOptionPane.showInputDialog(null,"Entrada invalida");
                e.printStackTrace();
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showInputDialog(null,"Impossivel");
            }
            finally{
                System.out.println("finally");
            }
            System.out.println("continua");
        }while(continueLooping);


    }
    public static int dividir(int a, int b){
        return a /b;
    }
}
