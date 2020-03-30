package task2;

public class PriorityOperationsMain {
    public static void main(String[] args) {
        int a8 = 8;
        int a2 = 2;

        System.out.println(5 + 2 / 8);
        System.out.println((5 + 2) / 8);
        System.out.println((5 + a2++) / 8);
        System.out.println((5 + a2++) / --a8);
        System.out.println((5 * 2 >> a2++) / --a8);
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a2++) / --a8);
        System.out.println(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a2++ / --a8);
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
        System.out.println(true && false);
    }
}
