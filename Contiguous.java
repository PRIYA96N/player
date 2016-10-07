
import java.io.*;
import java.util.*;
public class Contiguous{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sub=sc.nextInt(),count=0;
        int a=sc.nextInt(),temp=0,sum=0;
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {count=0;
        sum=0;
            
            for(int j=i;j<a;j++)
            {
              if(count<sub)
              {
                  sum=sum+b[j];
              }
              count++;
            }
            if(sum>temp)
            temp=sum;
        }
        System.out.println(temp);
     }
}
