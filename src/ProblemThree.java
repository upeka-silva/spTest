import java.util.ArrayList;
import java.util.List;

public class ProblemThree {

    public static List<Long> getSumFib() {
        List<Long> fib = new ArrayList<>();
        fib.add(0L);  // first number
        fib.add(1L);  // second number

        for (int i = 2; i < 100; i++) {
            long next = fib.get(i - 1) + fib.get(i - 2);
            fib.add(next);
        }

        return fib;
    }

}
