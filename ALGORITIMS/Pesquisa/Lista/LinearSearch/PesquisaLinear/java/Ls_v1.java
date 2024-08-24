#by cybermago linearsearch v1
import java.util.Scanner;
public class Ls_v1 {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("que número voce quer?: ");
        int op = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            op = arr[i];
            if (arr.equals(op)) {
                System.out.printf("%d número encontrado\n",i);
            }else{
                System.out.printf("número não encontrado");
                break;
            }
        }
    }
}
