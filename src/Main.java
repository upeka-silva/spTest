import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Problem one
        //i used static function
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        ProblemOne.sumFor(numbers);
        System.out.println();
        ProblemOne.sumWhile(numbers);
        System.out.println();
        ProblemOne.sumRecursion(numbers);
        System.out.println();

        System.out.println("===============================");
        //Problem Two
        List<Integer> numbersListTwo = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> sumTwoArray = ProblemTwo.getSumTwoArray(numbers, numbersListTwo);
        System.out.println("Result of Problem Two :"+sumTwoArray);

        System.out.println("===============================");
        // Problem Three
        List<Long> sumFib = ProblemThree.getSumFib();
        System.out.println("Result of Problem three :"+sumFib);

        System.out.println("===============================");
        // Problem Four
        int []list = {10,29,90};
        ProblemFour.largestNumber(list);
        System.out.println("Result of Problem Four :"+sumFib);

        System.out.println("===============================");
        System.out.println("Result of Problem Five :"+sumFib);
        ProblemFive.solve("", 1, 0, 0);







    }
}