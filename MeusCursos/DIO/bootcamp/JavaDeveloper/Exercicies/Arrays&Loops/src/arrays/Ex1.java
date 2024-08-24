package arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i=0;


        while (i < (arr.length-1)){
            System.out.print(arr[i]);
            i++;
        }

        for(i = (arr.length -1); i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
