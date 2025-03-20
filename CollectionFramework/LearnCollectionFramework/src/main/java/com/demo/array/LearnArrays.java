package com.demo.array;

public class LearnArrays {
    public static void main(String[] args) {
        System.out.println("hello World!!");
        // one d array
        int [] a = {1,2,4,5,6};

        //jagged array
        int b [][] = new int [2][];
         b[0] = new int[2];
         b[1] = new int[3];
         b[2] = new int[3];

         //3-D Arrays
         int i[][][] = new int [3][][];
         i [0] = new int [2][];
         i [1] = new int [2][];
         i [2] = new int [2][];

        i[0][0] = new int [1];
        i[0][1] = new int [1];

        i[1][0] = new int [1];
        i[1][1] = new int [1];

        i[2][0] = new int [1];
        i[2][1] = new int [1];

    }


}
