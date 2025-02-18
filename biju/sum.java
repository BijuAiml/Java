
public class sum {

    public static void main(String args[]) {
        int n = 5;
        int term = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + n;
            sum += term;
        }
        System.out.print(sum);
    }
}
