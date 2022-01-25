import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p[]=new int[4];
        int a[]=new int[4];
        int b[]=new int[4];
        for(int i=0;i<4;i++)
        {
            p[i]=sc.nextInt();
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[j]>a[j+1])
                {
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    tem=p[j];
                    p[j]=p[j+1];
                    p[j+1]=tem;
                    tem=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tem;
                }
            }
        }
        int s2=0,s3=0;
        int w[]=new int[4];
        for(int i=0;i<4;i++)
        {
            
            s2+=b[i];
            w[i]=s3;
            s=a[i];
            s3=s2-s-1;

        }
         for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(p[j]>p[j+1])
                {
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    tem=p[j];
                    p[j]=p[j+1];
                    p[j+1]=tem;
                    tem=w[j];
                    w[j]=w[j+1];
                    w[j+1]=tem;
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.print("P"+p[i]+" (WT="+(w[i])+")");
            if(i<3)
                 System.out.print(", ");
        }
    }
}
