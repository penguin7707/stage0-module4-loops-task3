package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String l = Integer.toString(t);
        char[] chars = l.toCharArray();
        int sum = 0;
        for(char ch: chars){
            sum = sum + (int)ch;
        }
    }
}
