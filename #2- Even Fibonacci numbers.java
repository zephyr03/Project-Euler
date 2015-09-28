import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner test=new Scanner(System.in);
        long t=test.nextLong();
        
        for(int i=0;i<t;i++){
            fibSeries(test.nextLong());
        }
    }
    
    public static void fibSeries(long N){
    	long value=2;
    	long first=1;
    	long second=2;
    	for(long i=1;i<=N;i++){
    		long sum=first+second;
    		first=second;
    		second=sum;
    		//System.out.println(sum);
    		if(sum%2==0 && sum <N){
    			value+=sum;
    		}
    		
    		if(sum>N) break;
    	}
    	System.out.println(value);
    }
}