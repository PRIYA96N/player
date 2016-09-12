import java.util.Scanner;
public class Firststring1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.next();
    String []s=new String[a];
    for(int i=0;i<a;i++)
    {   s[i]=sc.nextLine();
    }
   for(int i=0;i<a;i++)
   {
	   char b[]=s[i].toCharArray();
	   int c=b.length;
	   if(c==1)
	   {
		   System.out.println(s[i]);
		   break;
	   }
	   
   }
    
	}

}
