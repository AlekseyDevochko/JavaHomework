package mass;

import java.util.Scanner;

public class MassMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива :");
        int size = scan.nextInt();
        int[] arr = new int[size];
        Mass.massIn(arr);
        Mass.massFor(arr);
        Mass.massWhile(arr);
        Mass.massDoWhile(arr);
        Mass.massForeach(arr);
    }
}
