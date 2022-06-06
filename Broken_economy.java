import java.util.Scanner;

public class Broken_economy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {


            int mid = (left + right) / 2;

            if (arr[mid] >= k) {
                right = mid - 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            }
        }
        System.out.println(arr[left]);
        System.out.println(arr[right]);

    }
}
