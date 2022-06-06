import java.util.Scanner;

public class Decimal_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = GetanyBase(n, d);
        System.out.println(ans);
    }
    public static int GetanyBase(int n, int d){
        int ans = 0;
        int count = 0;
        while(n != 0){
            int r = n % d;

            ans = ans + r * (int)Math.pow(10, count);
            count++;

             n = n / d;
        }
        return ans;
    }
}
