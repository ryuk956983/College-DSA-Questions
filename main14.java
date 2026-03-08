import java.util.*;
public class main14 {

    public void main(String[] args) {
        int[][] a = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int[][] b = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};

        if (a.length != b.length) {
            System.out.println("Matrices are not Identical");
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!Arrays.equals(a[i],b[i])) {
                System.out.println("Matrices are not Identical");
                return;
            }
        }
        System.out.println("Matrices are Identical");
    }
}
