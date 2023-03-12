package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = "" + t;
        int result = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            result += t % 10;
            t /= 10;
        }
        System.out.println(result + t);
    }
}
