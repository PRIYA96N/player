import java.util.*;
public class Charreverse{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s1=new StringBuffer(s).reverse().toString();
       char c[]=s1.toCharArray();
       LinkedHashSet<Character> ts=new LinkedHashSet<Character>();
       for(int i=0;i<s1.length();i++)
        {
        ts.add(c[i]);
        }
        Iterator<Character> ir=ts.iterator();
        while(ir.hasNext())
        {
        System.out.print(ir.next());
     }}

}
