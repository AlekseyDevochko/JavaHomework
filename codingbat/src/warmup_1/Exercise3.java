package warmup_1;

public class Exercise3 {
    public boolean nearHundred(int n) {
        return ((Math.abs(100-n) <= 10) || (Math.abs(200-n) <=10));
    }

}