package LeetCode;
import java.util.*;
public class Bits {
	    public static int hammingWeight(int n) {
	        int q=0;
	        while(n>0){
	            int y = n%2;
	            if(y==1){
	                q++;
	            }
	            n/=2;
	        }
	        return q;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(hammingWeight(x));

	}

}
