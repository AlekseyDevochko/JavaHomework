package task3;

public class If {
    private String name;
    If(String name){
        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } if (!name.equals("Вася") && !name.equals("Анастасия")){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
