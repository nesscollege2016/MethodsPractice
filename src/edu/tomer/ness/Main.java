package edu.tomer.ness;

public class Main {

    public static void main(String[] args) {
        int[][] matrix={{4, 2, 3, 4},
                        {1, 0, 3, 6},
                        {1, 1, 3, 7},
                        {1, 1, 3, 7}};
//the less preferred method:
/*        int[] diagonal = ArrayUtils.extractDiagonal(matrix);
        //4, 0, 3, 7
        ArrayUtils.sortArr(diagonal);
        //0, 3, 4, 7
        ArrayUtils.replaceDiagonal(matrix, diagonal);
        IOUtils.print(matrix);*/

//
        System.out.println("Before:");
        IOUtils.print(matrix);
        System.out.println("After:");
        //all the work is done here:
        ArrayUtils.sortDiagonal(matrix);
        IOUtils.print(matrix);
    }








}
