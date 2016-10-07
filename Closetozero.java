import java.io.*;
import java.util.*;
public class Closetozero{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),c=0;
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        for(int j=0;j<a;j++)
        {
            System.out.println(b[j]);
        }
        for(int i=0;i<a;i++)
        {
            if(i!=0)
            {
            if(b[i]>=0)
            {
             c=b[i]+b[i-1]; 
             break;
            }
                else if(i==a-1 && b[i]<=0)
                {
                    c=b[i]+b[i-1];
                    break;
                }
            }
            else if(b[i]>=0)
            {
                c=b[i]+b[i+1];
                break;
            }
        }
        System.out.println(c);
     }
}
