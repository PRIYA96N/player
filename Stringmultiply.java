import java.util.Scanner;
public class Stringmultiply {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int a=Integer.parseInt(s);
        int b=Integer.parseInt(s1);
        int c=(a*b);
        String s2=Integer.toString(c);
        System.out.println(s2);
      
	}

}
