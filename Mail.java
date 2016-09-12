
import java.util.Scanner;
public class Mail {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int a=s.length();
      String s1[]=s.split("@");
      String s2[]=s.split(".");
      int count=0;
     if((s1.length!=2)&&(s2.length!=2))
    		 {
    	 System.out.println("It is an invalid mailid");
    		 }
     else
     {   
    	 if(s1[0].length()>2)
    	 {   char c[]=s1[1].toCharArray();
    		 for(int i=0;i<c.length;i++)
    		 {
    			String ss1=c[i]+"";
    			if(ss1.equals("."))
    			{
    				break;
    			}
    			else
    				count++;
    		 }
    	 }
    	 if(count>3)
    	 {
    		 if(s.contains(".com"))
    		 {
    			 System.out.println("It is a valid mailid");
    		 }
     }else
    	 System.out.println("It is an invalid id");
    	 }
	}

}
