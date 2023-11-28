import java.util.Arrays;

public class Calc {
    public int arraysAverageCompare(int[] a, int[] b){
        double res_a = Arrays.stream(a).average().getAsDouble();
        double res_b = Arrays.stream(b).average().getAsDouble();
        if (res_a < res_b) return 1;
        else if (res_a == res_b) return 0;
        else return -1;
    }
}