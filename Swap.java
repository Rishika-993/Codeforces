import java.util.*;

public class Swap
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t<1 || t>100){
		    return;
		}
		
		char first;
		char second;
		
		for(int i=0; i<t; i++){
		  	String a = sc.next();
	    	String b = sc.next();
		    if(a.length()==3 && b.length()==3){
		        first = a.charAt(0);
		        second = b.charAt(0);
		        a = second + a.substring(1);
		        b = first + b.substring(1);
		    
		    }
		
		System.out.println(a + " " + b);
		}
		
	}
}