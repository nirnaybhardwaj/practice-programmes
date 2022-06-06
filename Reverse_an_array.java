import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);

    }
    public static void reverse(int[] arr){
        int a = 0;
        int b = arr.length - 1;

        while(a <= b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
