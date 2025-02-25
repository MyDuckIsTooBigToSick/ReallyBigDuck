import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0; 

       
        for (int i = 1; i <= n; i++) {
            sum += i * 11; 
        }

        System.out.println("S=" + sum);
        sc.close(); 
    }
}
