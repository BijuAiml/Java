
class patten {

    /*
    public static void row(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        row(n - 1);
    }

    public static void changerow(int n) {
        if (n == 0) {
            return;
        }
        changerow(n - 1);
        row(n);
        System.out.print("\n");

    }

    public static void main(String[] args) {
        patten.changerow(7);
    }
}*/
    public static void rigth(int n) {
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int c = 5;
        rigth(c);

    }
}
