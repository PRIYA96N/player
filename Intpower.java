import java.util.*;
public class Intpower{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       String s=Integer.toString(a);
       int b=s.length(),i=0,sum=0;
       int c[]=new int[b];
       while(a!=0)
       {
         c[i]=a%10;
         a=a/10;
         i++;
       }
       Arrays.sort(c);
       for(int j=0;j<b;j++)
       {   if(j!=b-1)
           sum=(int)(sum+Math.pow(c[j],c[j+1]));
           else
           sum=(int)(sum+Math.pow(c[j],0));
           
       }
       System.out.print(sum);
    }
}
