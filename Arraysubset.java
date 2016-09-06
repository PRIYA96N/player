import java.util.*;
public class Arraysubset{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int c=sc.nextInt();
      int b[]=new int[a];
      int d[]=new int[c];
      for(int i=0;i<a;i++)
      {
          b[i]=sc.nextInt();
         // s1=s1+""+b[i];
      }
      
      for(int j=0;j<c;j++)
      {
          d[j]=sc.nextInt();
      }
      Arrays.sort(b);
      Arrays.sort(d);
      String s=Arrays.toString(b);
      String s1=Arrays.toString(d);
     if(s1.contains(s))
      System.out.print("true");
      else
          System.out.print("false");
     }
}
