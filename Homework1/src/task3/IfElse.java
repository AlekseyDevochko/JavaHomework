package task3;

public class IfElse {
    private String name;
    IfElse(String name){
        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (name.equals("Анастасия"))  System.out.println("Я тебя так долго ждал");
        else System.out.println("Добрый день, а вы кто?");
    }
}
