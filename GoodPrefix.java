
import java.util.Scanner;

public class GoodPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int k=0; k<t; k++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
        
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            long totalSum = 0;
            int count = 0;
        
            for (int i = 0; i < n; i++) {
                
                totalSum = totalSum + arr[i];
                int check = 0;
                for (int j = 0; j <= i; j++) {
                    long sum = totalSum - arr[j];
                    if (arr[j] == sum) {
                        check = 1;
                        break;
                    }
                }
                
                if (check == 1) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    
    }
}

