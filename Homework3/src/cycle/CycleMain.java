package cycle;

import java.util.Scanner;

public class CycleMain {
    public static void main(String[] args) {
        //Cycle.outputSchedule();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число :");
//        int number1 = scan.nextInt();
//        Cycle.outputFact(number1);

        int number2 = scan.nextInt();
        Cycle.outputMultiplication(number2);

    }
}
