import java.util.*;

public class MaximumMultiple
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t<1 || t>100){
		    return;
		}
		
		int k, sum = 0;
		
		for(int j=0; j<t; j++){
		    int n = sc.nextInt();
		    int max = 0;
		    int best = 0;
		    for(int i=2; i<=n; i++){
		       k = n/i; 
		       sum = i * k * (k + 1) / 2;
		       if(sum>max){
		           max = sum;
		           best = i;
		       }
		    }
		
		System.out.println(best);
		}
		
	}
}