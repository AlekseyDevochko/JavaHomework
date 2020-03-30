package cycle;

public class Cycle {
    static void outputSchedule (){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    static void outputFact (int number){
        int res = 1;
        for (int i = 1; i <= number; i++){
            res *= i;
        }
        System.out.println("Результат = " + res);
    }

    static void outputMultiplication (Integer number){
        String str = Integer.toString(number);
        int size = str.length();
        int res = 1;
        char[] arr = str.toCharArray();
        for (int i = 0; i < size; i++){
            res*=Character.getNumericValue(arr[i]);
        }
        System.out.println("Произведение цифр числа " + number + " = " + res);
    }
}
