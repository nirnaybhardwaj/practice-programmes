import java.util.Scanner;

public class Difference_of_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = new int[n2];

        int index1 = arr1.length - 1;
        int index2 = arr2.length - 1;
        int index3 = ans.length - 1;

        int borrow = 0;

        while(index2 >= 0){
            int r1 = arr2[index2];
            int r2;
            if(index1 < 0){
                r2 = 0;
            }else{
                r2 = arr1[index1];
            }
            r1 = r1 - borrow;
            int sub = r1 - r2;

            if(sub < 0){
                borrow = 1;
                sub = sub + 10;
            }
            else {
                borrow = 0;
            }

            ans[index3] = sub;

            index1--;
            index2--;
            index3--;
        }
        int x = 0;
        while(ans[x] == 0){
            x++;
        }
        for (int i = x; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
