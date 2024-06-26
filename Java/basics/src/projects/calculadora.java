
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//by cybermago
public class calculadora {

    public static int selecionar(Scanner scan){
        System.out.println("Digite a opção desejada: ");
        return scan.nextInt();
    }



    public static void main(String[] args) throws Exception {

        List<String> menu = new ArrayList<>();
        menu.add("1 - Soma");
        menu.add("2 - Subtração");
        menu.add("3 - Divisão");
        menu.add("4 - Resto");
        Scanner scan = new Scanner(System.in);

        int soma,sub,div,rest,num1,num2,opc;

        menuString(menu);

        opc = selecionar(scan);

        while (opc>0) {
        switch (opc){

            case (int)1:
            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();
            soma = num1 + num2;
                
            System.out.printf("Resposta: %d\n",soma);
            while (opc>0) {
                menuString(menu);
                opc = selecionar(scan);
            }
                break;

            case (int)2:
            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();
            sub = num1 - num2;
            System.out.printf("Resposta: %d\n",sub);
            while (opc>0) {
                menuString(menu);
                opc = selecionar(scan);
            }
                break;
            case (int)3:
            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();
            if (num2 == 0) {
                System.out.println("Não é possível dividir por zero");
            }else{
                div = num1 / num2;
                System.out.printf("Resposta: %d\n",div);
            }
            while (opc>0) {
                menuString(menu);
                opc = selecionar(scan);
            }
                break;

            case (int)4:
            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();
            rest = num1 % num2;
            System.out.printf("Resposta: %d\n",rest);
            while (opc>0) {
                menuString(menu);
                opc = selecionar(scan);
            }
                break;
        
            default:
            while (opc>0) {
                if (opc>=1 && opc<=4) {
                    opc = selecionar(scan);
                }else{
                    System.out.println("Digite uma opção válida");
                    opc = selecionar(scan);
                }
                
            }
                break;
        }
    }

        scan.close();
        }
        public static void menuString(List<String> menu) {
            for (String elemento : menu) {
                System.out.println(elemento);
            }
        }
    }