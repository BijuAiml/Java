
public class add_array {

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4};
        int B[] = {6, 5, 3, 1};
        int n = A.length;
        int quotient = 0;
        int sum = 0;
        int new_value[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                if (quotient == 0) {
                    sum = A[i] + B[j];
                } else {
                    sum = A[i] + B[j] + quotient;
                }
            }
            new_value[i] = sum % 10;
            quotient = sum / 10;
        }
        for (int num : new_value) {
            System.out.print(num + " ");
        }
    }
}
