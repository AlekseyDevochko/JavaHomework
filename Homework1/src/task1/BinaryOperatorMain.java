package task1;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BinaryOperation obj = new BinaryOperation();
        // 15 = 00001111 42 = 00101010
        System.out.println("Числа 42 и 15:");
        System.out.println("Побитовое AND = " + obj.bitAnd(15,42));
        // результат:
        // двоичный = 00001010
        // десятичный = 10
        System.out.println("Побитовое NOT = " + obj.bitNot(15));
        // результат:
        // двоичный = 10010000
        // десятичный = -16
        System.out.println("Побитовое NOT = " + obj.bitNot(42));
        // результат:
        // двоичный = 10101011
        // десятичный = -43
        System.out.println("Побитовое OR = " + obj.bitOr(42, 15));
        // результат:
        // двоичный = 00101111
        // десятичный = 47
        System.out.println("Побитовый XOR = " + obj.bitXor(15, 42));
        // результат:
        // двоичный = 00100101
        // десятичный = 37
        System.out.println("Побитовый сдвиг вправо (15 на 42) = " + obj.bitRight(15,42));
        // результат:
        // двоичный = 00000000
        // десятичный = 0
        System.out.println("Побитовый сдвиг вправо (42 на 15) = " + obj.bitRight(42,15));
        // результат:
        // двоичный = 00000000
        // десятичный = 0
        System.out.println("Побитовый сдвиг влево (15 на 42) = " + obj.bitLeft(15,42));
        // результат:
        // двоичный = 0011 1100 0000 0000
        // десятичный = 15360
        System.out.println("Побитовый сдвиг влево (42 на 15) = " + obj.bitLeft(42,15));
        // результат:
        // двоичный = 0001 0101 0000 0000 0000 0000
        // десятичный = 1376256
    }
}
