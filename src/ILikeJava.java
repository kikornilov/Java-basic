import java.util.Scanner;

public class ILikeJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String startLine = in.nextLine();
        if (startLine.contains("Java")){
            if (startLine.startsWith("I like")){
                if (startLine.endsWith("!!!")){
                    System.out.print(startLine.toUpperCase());
                }
            }
        }
        String result = startLine.replace('a', 'o');
        System.out.print(result.substring(7, 11));
    }
}
