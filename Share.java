import java.util.Arrays;
import java.util.Scanner;
public class Share {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int b[]=new int[10];
	    for(int i=0;i<10;i++)
	    	b[i]=sc.nextInt();
	    Arrays.sort(b);
	    System.out.println(b[9]-b[0]);
	}

}
