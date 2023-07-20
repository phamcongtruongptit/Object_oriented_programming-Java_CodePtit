import java.util.Arrays;
import java.util.Scanner;
public class giao_2_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt() ;
        int n = scanner.nextInt() ;
        int []A = new int[1005] ; 
        int []B = new int[1005] ; 
        int []C = new int[1005] ; 
        int []D = new int[1005] ; 


        Arrays.fill(C , 0);
        Arrays.fill(D , 0);

        for(int i = 0 ; i < m ; i++){
            A[i] = scanner.nextInt();
            C[A[i]]++ ; 
        }
        
        for(int i = 0 ; i < n ; i++){
            B[i] = scanner.nextInt();
            D[B[i]]++ ;
        }

        for(int i=0 ; i<1005 ; i++){
            if(C[i] == D[i] && C[i] == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
