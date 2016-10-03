import java.io.*;
import java.util.*;
public class Registrationno{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),temp=0;
       int n[]=new int[a];
       for(int i=0;i<a;i++)
       {
           n[i]=sc.nextInt();
       }
       Arrays.sort(n);
       for(int i=0;i<a;i++)
       {
           for(int j=i+1;j<a;j++)
           {
               if(n[i]==n[j])
               {
                   if(temp==n[j])
                   {
                       continue;
                   }
                   else
                   {
                       temp=n[i];
                   System.out.println(temp);
                   }
               }
           }
       }
     }
}
