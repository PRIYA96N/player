
import java.io.*;
import java.util.*;
public class Palinsum{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),temp=0,sum=0;
        String ss="",ss1="";
        while(s!=0)
        {
            temp=s%10;
            sum=sum+temp;
            s=s/10;
        }
      ss=sum+"";
      ss1=new StringBuffer(ss).reverse().toString();
      if(ss.equals(ss1))
        System.out.println("Palindrome");
        else
         System.out.println(" not a Palindrome");
     }
}
