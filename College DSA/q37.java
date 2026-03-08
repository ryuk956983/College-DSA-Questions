
public class q37 {

    public static void rotate(String s, String goal) {

        char[] arr = s.toCharArray();
        char[] temp = new char[arr.length];
        int i = 1;
        while (i <=s.length()) {
            if (s.equals(goal)) {
                System.out.println(true);
                return;
            }
            for (int l = 0; l < s.length(); l++) {
                temp[(1 + l) % s.length()] = arr[l];
            }
            s = new String(temp);
            arr = s.toCharArray();

            i++;

        }
        System.out.println(false);

    }

    public void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        rotate(s, goal);
    }

}
