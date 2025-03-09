public class Pattern20 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j);
                if (j > i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
