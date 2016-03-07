package edu.tomer.ness;

import java.util.Scanner;

/**
 * Created by Dev on 07/03/2016.
 */
public class IOUtils {
    static int getInt(String prompt){
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        int n = s.nextInt();
        return n;
    }

    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
