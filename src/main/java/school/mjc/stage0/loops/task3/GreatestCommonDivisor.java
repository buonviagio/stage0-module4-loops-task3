package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = 0;
        if (first == 0 || second == 0) {
            System.out.println(first + "" + second);
        } else if (first > second) {
            first = first + second;
            second = first - second;
            first = first - second;
        }
        for (int i = 1; i <= first; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
