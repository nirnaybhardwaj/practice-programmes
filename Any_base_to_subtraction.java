import java.util.Scanner;

public class Any_base_to_subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = subtraction(n1, n2, b);
        System.out.println(ans);
    }
    public static int subtraction(int n1, int n2, int b){
        int borrow = 0;
        int ans = 0;
        int count = 0;
        while(n2 != 0){
            int r1 = n2 % 10;
            int r2 = n1 % 10;

            r1 = r1 - borrow;
            if(r2 > r1){
                borrow = 1;
                r1 = r1 + b;
            }else{
                borrow = 0;
            }

            int sub = r1 - r2;

            n1 = n1 / 10;
            n2 = n2 / 10;

            ans = ans + sub * (int)Math.pow(10,count);
            count++;
        }
        return ans;
    }
}
