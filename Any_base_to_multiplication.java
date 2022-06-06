import java.util.Scanner;

public class Any_base_to_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = multiplication(n1, n2, b);
        System.out.println(ans);

    }
    public static int multiplication(int n1, int n2, int b){
        int ans = 0;

        int count = 1;

        while(n2 != 0){
            int r2 = n2 % 10;

            int curr = getMultiplyBySingleDigit(n1, r2, b) * count;
            count *= 10;

            ans = getSum(ans, curr, b);
            n2 = n2 / 10;
        }
        return ans;
    }
    public static int getMultiplyBySingleDigit(int n1, int r2, int b){
        int c = 0;
        int ans = 0;
        int count = 0;

        while(n1 != 0 || c!= 0){
            int r1 = n1 % 10;

            int mul = r2 * r1 + c;
            int digit = mul % b;
            c = mul / b;

            ans = ans + digit * (int)Math.pow(10, count);
            count++;
            n1 = n1 / 10;
        }
        return ans;
    }
    public static int getSum(int n1, int n2, int b){
        int c = 0;
        int ans = 0;
        int count = 0;

        while(n1 != 0 || n2 != 0 || c != 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            int add = r1 + r2 + c;
            int digit = add % b;
            c = add / b;

            n1 = n1 / 10;
            n2 = n2 / 10;

            ans = ans + digit * (int)Math.pow(10,count);
            count++;
        }
        return ans;
    }
}
