package task1;

import java.util.Scanner;

public class ColorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of color : ");
        int number = scan.nextInt();

        Color rainbow = new Color(number);
        System.out.println("Color : " + rainbow.getName(number));
        System.out.println("Color number :" + rainbow.getNumber());
    }
}
