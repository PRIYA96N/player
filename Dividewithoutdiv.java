import java.util.*;
public class Dividewithoutdiv {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int divident=sc.nextInt();
     int divisor=sc.nextInt();
     int count=0;
     while(divident>=0)
     {
    	 divident=divident-divisor;
    	 count++;
     }
     System.out.println(count-1);
	}

}
