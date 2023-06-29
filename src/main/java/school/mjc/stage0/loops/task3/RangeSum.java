package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum=0;
        int min = firstBoarder>secondBoarder?secondBoarder:firstBoarder;
        int max = firstBoarder>secondBoarder?firstBoarder:secondBoarder;
        for(int i=min;i<=max;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
