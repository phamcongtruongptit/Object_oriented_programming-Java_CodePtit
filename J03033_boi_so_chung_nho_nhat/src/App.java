import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            BigInteger a = scanner.nextBigInteger() ; 
            BigInteger b = scanner.nextBigInteger() ; 
            BigInteger mul = a.multiply(b) ; 
            BigInteger gcd = a.gcd(b) ; 
            BigInteger lcm = mul.divide(gcd) ; 
            System.out.println(lcm);
        }
    }
}
