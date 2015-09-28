import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class largeSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner test=new Scanner(System.in);
        int N=test.nextInt();
        double sum=0;
        while(N>0){
            Double number=test.nextDouble();
            sum+=number;
            N--;
        }
        
       //System.out.println(Math.getExponent(sum));
       System.out.print(BigDecimal.valueOf(sum).toPlainString().substring(0,10));
    }
}