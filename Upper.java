import java.util.Scanner;
public class Upper {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2[]=s1.split(" ");
    for(int i=0;i<s2.length;i++)
    {
    	char a[]=s2[i].toCharArray();
    	String s3=new StringBuilder(s2[i]).reverse().toString();
    	char b[]=s3.toCharArray();
    	for(int j=0;j<s3.length();j++)
    	{
    		if(Character.isUpperCase(a[j]))
    		{
    			b[j]=Character.toUpperCase(b[j]);
    		}
    		else
    			b[j]=Character.toLowerCase(b[j]);
    		System.out.print(b[j]);
    	}
    	System.out.print(" ");
    }
	}

}
