import java.util.Scanner;

public class Any_base_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        int convert = AnybaseToDecimal(n, d1);
        int ans = DecimalToAnyBase(convert, d2);
        System.out.println(ans);
    }
    public static int AnybaseToDecimal(int n, int d1){
        int ans = 0;
        int count = 0;
        while(n != 0){
            int r = n % 10;
            ans = ans + r * (int)Math.pow(d1, count);
            count++;
            n = n / 10;
        }
        return ans;
    }
    public static int DecimalToAnyBase(int n, int d2){
        int ans = 0;
        int count = 0;
        while(n != 0){
            int r = n % d2;
            ans = ans + r * (int)Math.pow(10, count);
            count++;
            n = n / d2;
        }
        return ans;
    }
}
