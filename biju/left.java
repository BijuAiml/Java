
class left {

    public static void biju(int n) {
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 2 * (n - a); b >= 0; b++) {
                System.out.print("");
            }
            for (b = 0; b <= a; b++) {
                System.out.print("* ");

            }
        }
        
        

    public static void main(String
          [args]){
            int n = 5;
        biju(n);
    }
}

}
