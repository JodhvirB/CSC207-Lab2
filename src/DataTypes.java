import java.util.ArrayList;
import java.util.List;

public class DataTypes {

    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        long x = 500_000_500_000L;
        List<Integer> lst = new ArrayList<>();

        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
            x = sum(lst);
        }
        System.out.println(x);
    }
}