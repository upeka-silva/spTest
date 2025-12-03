public class ProblemFive {

    public static void solve(String expr, int n, int sum, int lastNum) {
        if (n == 10) {
            if (sum == 100) {
                System.out.println(expr);
            }
            return;
        }

        solve(expr + "+" + n, n + 1, sum + n, n);

        solve(expr + "-" + n, n + 1, sum - n, -n);

        int concatNum = 0;
        if (lastNum >= 0) {
            concatNum = lastNum * 10 + n;
            solve(expr + n, n + 1, sum - lastNum + concatNum, concatNum);
        } else {
            concatNum = lastNum * 10 - n;
            solve(expr + n, n + 1, sum - lastNum + concatNum, concatNum);
        }
    }

}
