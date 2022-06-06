import java.util.Scanner;


public class Span_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int ans = max - min;
        System.out.println(ans);
    }
}
