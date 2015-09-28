import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        long T=scan.nextLong();
        for(long i=0;i<T;i++){
            long N=scan.nextLong();
            long diff=0;
            diff=wholeSum(N)-indiSum(N);
            System.out.println(diff);
        }
    }
    
    public static long indiSum(long N){
        long sum=0;
        for(long a=1;a<=N;a++){
            sum+=(a*a);
        }
        
        return sum;
    }
    
    public static long wholeSum(long N){
        long newSum=0;
        for(long b=1;b<=N;b++){
            newSum+=b;
        }
        
        return (newSum*newSum);
    }
}