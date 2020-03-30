package warmup_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая задача :");
        Exercise1 ex1 = new Exercise1();
        System.out.println(ex1.sleepIn(true,false));
        System.out.println(ex1.sleepIn(true,true));
        System.out.println(ex1.sleepIn(false,false));

        System.out.println("Вторая задача :");
        Exercise2 ex2 = new Exercise2();
        System.out.println(ex2.diff21(0));
        System.out.println(ex2.diff21(21));
        System.out.println(ex2.diff21(30));

        System.out.println("Третья задача :");
        Exercise3 ex3 = new Exercise3();
        System.out.println(ex3.nearHundred(109));
        System.out.println(ex3.nearHundred(89));
        System.out.println(ex3.nearHundred(190));
        System.out.println(ex3.nearHundred(230));
        System.out.println(ex3.nearHundred(100));

        System.out.println("Четвертая задача :");
        Exercise4 ex4 = new Exercise4();
        System.out.println(ex4.missingChar("hello",3));
        System.out.println(ex4.missingChar("hello",0));
        System.out.println(ex4.missingChar("hello",4));


    }
}
