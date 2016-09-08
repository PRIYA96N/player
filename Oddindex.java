import java.util.*;
public class Oddindex{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s1[]=s.split(" ");
       for(int i=0;i<s1.length;i++)
       { String s2=s1[i];
           if(i%2==0)
           {
               s2=new StringBuffer(s2).reverse().toString();
           }
           System.out.print(s2+" ");
       }
     }
}
