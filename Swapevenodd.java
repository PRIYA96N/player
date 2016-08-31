import java.util.*;
public class Swapevenodd{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char s[]=a.toCharArray();
        if(s.length%2==0)
        for(int i=0;i<s.length;i=i+2)
        {
            char temp=s[i];
            s[i]=s[i+1];
            s[i+1]=temp;
            System.out.print(""+s[i]+s[i+1]);
        }
     }
}
