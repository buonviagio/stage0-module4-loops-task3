package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        new NinesSum().calculateSum(0);
    }
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        if (lengthOfLastNumber == 0){
            System.out.println(0);
            return;
        } else if (lengthOfLastNumber == 1){
            System.out.println(9);
        } else {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                for (int j = 1; j <= i; j++) {
                    result += 9;
                }
            }
        }
        System.out.println(result);
    }
}
