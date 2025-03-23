import java.util.Scanner;
public class panoramixsPrediction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int nNextPrime = n+1;
        while (!isPrime(nNextPrime)) {
            nNextPrime += 1;
        }
        if(m == nNextPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
       }
    public static boolean isPrime(int n) {
    if(n <= 1) { return false;}
    if(n <= 3) { return true; }
    if(n % 2 == 0 || n % 3 == 0) { return false; }

    for(int i = 5; i * i <= n; i = i + 6) {
        if(n % i == 0 || n % (i + 2) == 0) { return false; }
    }
    return true;
    }
}
