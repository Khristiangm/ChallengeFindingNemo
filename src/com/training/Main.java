package com.training;

import java.util.Scanner;

public class Main {

    public static boolean isNemoInThere(char[][] sea) {
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea.length; j++) {
                if (sea[i][j] == 'N' || sea[i][j] == 'n') {
                    if (i < 2) {
                        if (sea[i + 1][j] == 'e') {
                            if (sea[i + 2][j] == 'm') {
                                if (sea[i + 3][j] == 'o') {
                                    return true;
                                }
                            }


                        }
                    } else if (i > 2) {
                        if (sea[i - 1][j] == 'e') {
                            if (sea[i - 2][j] == 'm') {
                                if (sea[i - 3][j] == 'o') {
                                    return true;
                                }
                            }
                        }
                    }

                }
                if (j < 2){
                    if (sea[i][j+1] == 'e'){
                        if (sea[i][j+1] == 'm'){
                            if (sea[i][j+1] == 'o'){
                                return true;
                            }
                        }
                    }
                }else if (j > 2){
                    if (sea[i][j-1] =='e'){
                        if (sea[i][j-2] == 'm'){
                            if (sea[i][j-3] == 'o'){
                                return true;
                            }
                        }
                    }
                }

            }
        }

        return false;
    }

    private static void printMatrix(char[][] matrix) {
        System.out.println();
        for (int m = 0; m < matrix.length; m++) {
            char[] row = matrix[m];
            for (int n = 0; n < row.length; n++) {
                char col = row[n];
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[5][];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Line #" + (i + 1) + ": ");
                matrix[i] = scanner.nextLine().toLowerCase().trim().toCharArray();
            } while (matrix[i].length != 5); // Ha! Told you do-whiles are useful! :P
        }
        return matrix;
    }


    public static void main(String[] args) {
        char[][] sea = inputMatrix();
        printMatrix(sea);

        if (isNemoInThere(sea)) {
            System.out.println("Nemo found!!!");
        } else {
            System.out.println("Nemo Not Found! :/");
        }
    }
}
