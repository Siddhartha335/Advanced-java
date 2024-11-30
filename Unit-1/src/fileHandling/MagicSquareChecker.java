package fileHandling;

import java.io.*;
import java.util.*;

public class MagicSquareChecker {
    public static void main(String[] args) {
        String filename = "/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/output.txt";

        // Read the integers from the file into a 2D array
        int[][] magicSquare = new int[3][3];

        try (Scanner scanner = new Scanner(new File(filename))) {
            int i = 0, j = 0;

            while (scanner.hasNextInt()) {
                magicSquare[i][j] = scanner.nextInt();
                j++;
                if (j == 3) {
                    j = 0;
                    i++;
                }
            }

            if (isMagicSquare(magicSquare)) {
                System.out.println("The integers form a magic square.");
            } else {
                System.out.println("The integers do NOT form a magic square.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

    public static boolean isMagicSquare(int[][] square) {
        int magicSum = Arrays.stream(square[0]).sum();

        // Check the sum of each row
        for (int i = 1; i < 3; i++) {
            if (Arrays.stream(square[i]).sum() != magicSum) {
                return false; // If any row sum doesn't match, it's not a magic square
            }
        }

        // Check the sum of each column
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += square[i][j];
            }
            if (colSum != magicSum) {
                return false; // If any column sum doesn't match, it's not a magic square
            }
        }

        int diagonal1Sum = 0;
        for (int i = 0; i < 3; i++) {
            diagonal1Sum += square[i][i];
        }
        if (diagonal1Sum != magicSum) {
            return false;
        }

        int diagonal2Sum = 0;
        for (int i = 0; i < 3; i++) {
            diagonal2Sum += square[i][2 - i];
        }
        if (diagonal2Sum != magicSum) {
            return false;
        }

        // If all sums are equal, it's a magic square
        return true;
    }
}
