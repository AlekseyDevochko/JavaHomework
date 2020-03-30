package task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя : ");
        String name = scanner.nextLine();

        //Switch obj = new Switch(name);
        //IfElse obj1 = new IfElse(name);
        If obj2 = new If(name);

    }
}
