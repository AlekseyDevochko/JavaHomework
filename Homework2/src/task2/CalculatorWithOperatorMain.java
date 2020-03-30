package task2;

import java.util.Scanner;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        float number1 = scan.nextInt();
        float number2 = scan.nextInt();

        System.out.println("Sum : " + CalculatorWithOperator.operatorSum(number1, number2));
        System.out.println("Subtraction : " + CalculatorWithOperator.operatorSubtraction(number1, number2));
        System.out.println("Multiplication : " + CalculatorWithOperator.operatorMultiplication(number1, number2));
        System.out.println("Division : " + CalculatorWithOperator.operatorDivision(number1, number2));

    }
}
