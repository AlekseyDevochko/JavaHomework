package warmup_1;

public class Exercise4 {
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1);
    }
}
