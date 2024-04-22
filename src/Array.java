public class Array {
    public static void main(String[] args) {
        int [] myArray = {2, 5, 1, 8, 3};
        int var = myArray[0];
        myArray[0] = myArray[myArray.length - 1]; // Присваеваем первого элементу значение последнего {3, 5, 1, 8, 3}
        myArray[myArray.length - 1] = var; // Присваиваем последнему элементу значение первого {3, 5, 1, 8, 2}
        int midElement = myArray.length / 2; // Узнаем индекс среднего элемента
        System.out.println(myArray[0] + myArray[midElement]); // Сумма после перестановки первого и последнего элементов
    }
}
