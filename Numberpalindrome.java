import java.util.Scanner;
public class Numberpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b,sum=0;
		while(a!=0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		String c=Long.toString(sum);
		String d=new StringBuffer(c).reverse().toString();
		if(c.equals(d))
		{
			System.out.println("It is a palindrome");
		}
		else
           System.out.println("It is not a palindrome");
	}

}
