import java.util.Scanner;

public class Bar_chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            max = Math.max(max, arr[i]);
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
