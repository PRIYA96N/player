import java.io.*;
import java.util.*;
public class Indexjump{

     public static void digit(int str[])
     {
         int a=str.length;
         int j=0;
         while(j<a)
     {
         if(j==a-1)
         {
         System.out.print("true");
             break;
         }else
         j=j+str[j];
     }
     System.out.print("false");
     }
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b[]=new int[a];
     for(int i=0;i<a;i++)
     {
         b[i]=sc.nextInt();
     }
     Indexjump ij=new Indexjump();
     ij.digit(b);
     }
}
