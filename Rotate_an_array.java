import java.util.Scanner;

public class Rotate_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotate(arr, k);

    }
    public static void rotate(int[] arr, int k){
        int length  = arr.length;
        k = k % length;
        if(k < 0){
            k = k + length;
        }
        reverse(arr, 0, length - k - 1);
        reverse(arr, length - k, length - 1);
        reverse(arr, 0, length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr, int a, int b){

        while(a <= b){
            int temp  = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
    }
}

