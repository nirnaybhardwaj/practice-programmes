import java.util.Scanner;

public class Sum_of_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int [] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = Math.max(n1, n2);

        int[] ans = new int[max];

        int index1 = arr1.length - 1;
        int index2 = arr2.length - 1;
        int index3 = ans.length - 1;

        int c = 0;

        while(index1 >= 0 || index2 >= 0){
            int val1;
            int val2;
            if(index1 < 0){
                val1 = 0;
            }else{
                val1 = arr1[index1];
            }
            if(index2 < 0){
                val2 = 0;
            }else{
                val2 = arr2[index2];
            }
            int add = val1 + val2 + c;
            int digit = add % 10;
            c = add / 10;

            ans[index3] = digit;

            index1--;
            index2--;
            index3--;
        }
        if(c != 0){
            System.out.println(c);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
