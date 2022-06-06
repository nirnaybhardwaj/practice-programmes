import java.util.Scanner;

public class Digit_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        frequency(n, d);

    }
    public static void frequency(int n, int d){
        int count = 0;
        while (n > 0) {
            int r = n % 10;
            if(r == d){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
