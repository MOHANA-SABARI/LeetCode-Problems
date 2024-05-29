package LeetCode;
import java.util.*;
public class WordFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        
        Set <String> xx = new HashSet<>();
        
        String [] arr = x.split(" ");
        
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")){
                xx.add(arr[i]);
            }
        }
        
        String [] ar1 = new String[xx.size()];
        int [] ar = new int[xx.size()];
        int h =0;int y=1;
        
        for(String l : xx){
            ar1[h]= l;h++;
        }

        for(int i=0;i<xx.size();i++){
            for(int j=0;j<arr.length;j++){
                if(ar1[i].equals(arr[j])){
                   ar[i]=y++;
                   continue;
                }
            }
            y=1;
        }

        for(int i=0;i<xx.size();i++){
            System.out.println(ar1[i]+" "+ar[i]);
        }
        
	}

}
