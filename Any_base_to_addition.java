import java.util.Scanner;

public class Any_base_to_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = addition(n1, n2, b);
        System.out.println(ans);

    }
    public static int addition(int n1, int n2, int b){

        int ans = 0;
        int count = 0;
        int c = 0;
        while(n1 != 0 || n2 != 0 || c != 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            int add = r1 + r2 + c;
            int digit = add % b;
            c = add / b;

            n1 = n1 / 10;
            n2 = n2 / 10;

            ans = ans + digit * (int)Math.pow(10, count);
            count++;
        }

        return ans;
    }
}
