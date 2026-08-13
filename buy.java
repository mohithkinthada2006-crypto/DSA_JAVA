import java.util.*;

class buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int max = 0;
        int a = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < a) {
                a = prices[i];
            } else {
                max = Math.max(max, prices[i] - a);
            }
        }

        System.out.println(max);
    }
}