import java.util.Scanner;
import java.util.TreeSet;
public class Duplicateinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        TreeSet<String> t=new TreeSet<String>();
        t.add(s);
        System.out.println(t);
        TreeSet<Character> ts=new TreeSet<Character>();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        	ts.add(c[i]);
        }
        System.out.println(ts);
	}

}
