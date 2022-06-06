import java.util.Scanner;

public class First_and_last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int ans1 = first_index(arr, k);
        int ans2 = last_index(arr, k);
        System.out.println(ans1);
        System.out.println(ans2);

    }
    public static int first_index(int[] arr, int k){
        int left = 0;
        int right = arr.length - 1;
        int save = -1;
        while(left <= right){
            int mid = (right + left) / 2;

            if(arr[mid] == k){
                save = mid;
                right = mid - 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return save;
    }
    public static int last_index(int[] arr, int k){
        int left = 0;
        int right = arr.length - 1;
        int save = -1;
        while(left <= right){
            int mid = (right + left) / 2;

            if(arr[mid] == k){
                save = mid;
                left = mid + 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return save;
    }
}
