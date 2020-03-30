package task1;

public class Color {
    private String name[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};
    private int number;

    public Color(int number){
        this.number = number-1;
    }

    public int getNumber() {
        ++number;
        return number;
    }

    public String getName(int number) {
        switch (number){
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Purple";
            default:
                return "Unknown";
        }

    }

}
