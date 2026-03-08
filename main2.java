//Pythagorean Triplets

public class main2 {
    public static void main(String[] args) {
        int n = 20;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && a * a + b * b == c * c) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}
