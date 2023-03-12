package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = firstBoarder;
        if (firstBoarder < secondBoarder) {
            for (int i = firstBoarder + 1; i <= secondBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        } else if (firstBoarder > secondBoarder){
            result = secondBoarder;
            for (int i = secondBoarder + 1; i <= firstBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
