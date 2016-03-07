package edu.tomer.ness;

/**
 * Created by Dev on 07/03/2016.
 */
public class ArrayUtils {
    static int[][] sortDiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1 - i; j++) {
                if (arr[j][j] > arr[j+1][j+1]) {
                    //swap
                    int temp = arr[j][j];
                    arr[j][j] = arr[j+1][j+1];
                    arr[j+1][j+1] = temp;
                }
            }
        }
        return arr;
    }

    static void sortArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void replaceDiagonal(int[][] arr, int[] diagonal){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = diagonal[i];
        }
    }
    static int[] extractDiagonal(int[][] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i][i];
        }
        return result;
    }
}
