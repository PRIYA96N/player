mport java.util.*;
public class Arrayonce{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
          int b[]=new int[a];
          for(int i=0;i<a;i++)
          {
              b[i]=sc.nextInt();
              
          }
          Arrays.sort(b);
          for(int i=0;i<a;i=i+2)
          {if(a%2==0)
              if(b[i]==b[i+1])
              continue;
              else
              System.out.print(b[i]);
          }
         
     }
}
