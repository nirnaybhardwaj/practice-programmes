import java.util.Arrays;
import java.util.Scanner;

public class Inverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] inv = inverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(inv[i]);
        }

    }
    public static int[] inverse(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            int val = arr[i];

            ans[val] = idx;
        }
        return ans;
    }
}
