import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {


    public static List<Object> getSumTwoArray(List<?> list1, List<?> list2) {
        List<Object> result = new ArrayList<>();

        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        return result;
    }

}