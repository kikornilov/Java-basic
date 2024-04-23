import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int numberLines = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int numberColumns = in.nextInt();
        double[][] twoDimArray = new double[numberLines][numberColumns];
        for (int i = 0; i < numberLines; i++) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.print("Введите " + j + " элемент " + i + " строки: ");
                twoDimArray[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int k = 0; k < numberColumns; k++){
            System.out.print(" " + twoDimArray[0][k] * 3 + " ");
        }
    }
}
