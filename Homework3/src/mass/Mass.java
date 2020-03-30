package mass;

import java.util.Scanner;

public class Mass {
    public static int[] massIn(int[] mass){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < mass.length; i++){
            mass[i] = scan.nextInt();
        }
        return mass;
    }

    public static void massFor(int[] mass){
        System.out.println("Вывод массива через FOR :");
        for (int i = 0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
    }

    public static void massWhile(int[] mass){
        System.out.println("Вывод массива через WHILE :");
        int i = 0;
        while (i < mass.length) {
            System.out.println(mass[i]);
            i++;
        }
    }

    public static void massDoWhile(int[] mass){
        System.out.println("Вывод массива через Do...WHILE :");
        int i = 0;
        do{
            System.out.println(mass[i]);
            i++;
        }while (i < mass.length);
    }

    public static void massForeach(int[] mass){
        System.out.println("Вывод массива через FOREACH :");
        for (int element:mass){
            System.out.println(element);
        }
    }
}


