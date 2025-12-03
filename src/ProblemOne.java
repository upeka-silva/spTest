import java.util.List;

public class ProblemOne {


    public static int sumFor(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }


    public static int sumWhile(List<Integer> list) {
        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }


    public static int sumRecursion(List<Integer> list) {
        return sumRecursion(list, 0);
    }

    private static int sumRecursion(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        return list.get(index) + sumRecursion(list, index + 1);
    }








}
