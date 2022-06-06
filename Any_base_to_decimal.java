import java.util.Scanner;

public class Any_base_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = GetvalueinDecimal(n, d);
        System.out.println(ans);
    }
    public static int GetvalueinDecimal(int n , int d){
        int ans = 0;
        int count = 0;
        while(n != 0){
            int r = n % 10;
            ans = ans + r * (int)Math.pow(d, count);
            count++;

            n = n / 10;
        }
        return ans;
    }
}
