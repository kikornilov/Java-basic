import java.util.Scanner;

public class CountingArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sumElements = 0;
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();
        double[] myArray = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент массива: ");
            myArray[i] = in.nextDouble();
        }
        for (int i = 0; i < arraySize; i++){
            sumElements = sumElements + myArray[i];
        }
        double average = sumElements / arraySize;
        for (int i = 0; i < arraySize; i++){
            System.out.printf(" %f",myArray[i] * average);
        }
    }
}
