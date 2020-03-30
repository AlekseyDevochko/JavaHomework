package task3;

public class Switch {
    private String name;

    Switch (String name){
        switch (name){
                case "Вася":
                    System.out.println("Привет!");
                case "Анастасия":
                    System.out.println("Я тебя так долго ждал");
                    break;
                default:
                    System.out.println("Добрый день, а вы кто?");
        }

    }

}
