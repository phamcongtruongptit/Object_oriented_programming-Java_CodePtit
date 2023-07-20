import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        int M[] = new int[n+5] ; 
        for(int i=0 ; i<n ; i++){
            M[i] = scanner.nextInt() ; 
        }
        ArrayList <String> ans = new ArrayList<String>() ; 
        for(int i=0 ; i<n-1 ; i++){
            int  min  = i ; 
            for(int j= i+1 ; j<n ; j++){
                if(M[j] < M[min]){
                    min = j ; 
                }
            }
            int tmp = M[i]  ;
            M[i] = M[min] ; 
            M[min] = tmp ; 
            String s = "" ; 
            s = s+ "Buoc " + Integer.toString(i+1) + ": " ; 
            // System.out.printf("Buoc %d: " , i+1);
            for(int item = 0 ; item< n; item++) {
                // System.out.print(M[item] + " ");
                s+= Integer.toString(M[item]) + " " ; 
            }
            ans.add(s) ; 
        }
        for(int i = ans.size()-1 ; i>=0 ; i--){
            System.out.println(ans.get(i));
        }
    }
}
