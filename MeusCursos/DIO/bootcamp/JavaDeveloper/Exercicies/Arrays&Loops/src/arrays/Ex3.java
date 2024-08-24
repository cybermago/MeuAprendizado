package arrays;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nums = new int[20];

        for(int i=0; i< nums.length; i++){
            int num = random.nextInt(100);
            nums[i] = num;
        }

        for(int numero: nums){
            System.out.println((numero+1));
        }

        for(int numero : nums){
            System.out.println((numero+1));
        }
    }
}
