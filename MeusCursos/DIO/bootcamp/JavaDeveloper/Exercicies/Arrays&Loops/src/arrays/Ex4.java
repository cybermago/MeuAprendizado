package arrays;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[][] m = new int[4][4];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j< m[i].length; j++){
                m[i][j] = rd.nextInt(9);
                System.out.println();
                System.out.println();
            }
        }
        for(int[] l : m){
            for(int[] c : m){
                System.out.println(c);
            }
            System.out.println();
        }
    }
}