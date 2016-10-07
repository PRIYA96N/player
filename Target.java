import java.io.*;
import java.util.*;
public class Target{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt(),a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(i!=a-1)
            for(int j=i+1;j<a;j++)
            {
            int c=b[i]+b[j];
            if(c==tar)
            {
                System.out.println(b[i]+" "+b[j]);
            }
            }
        }
     }
}
