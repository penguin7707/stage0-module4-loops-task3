package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        int max = first>second ? second:first;
        for(int i=1; i<=max; i++){
            if(first%i==0 && second%i==0) gcd=i;
        }
        System.out.println(gcd);
    }
}
