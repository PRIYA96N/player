mport java.util.*;
public class Arrayofijk{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int i[]=new int[a];
         int j[]=new int[a];
         int k[]=new int[a];
         for(int b=0;b<a;b++)
         {
             i[b]=sc.nextInt();
             j[b]=sc.nextInt();
             k[b]=sc.nextInt();
         }
         for(int b=0;b<a;b++)
         {
          for(int c=0;c<a;c++)
          {
            for(int d=0;d<a;d++)
            {
                if(i[b]+j[c]=k[d])
                {
                    System.out.print(b+" "+c+" "+d);
                }
            }
          }
         }
     }
}
