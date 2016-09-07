import java.util.*;
public class Nextdif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		int c[]=new int[a-1];
		int d[]=new int[a-1];
		int j=0;
		for(int i=0;i<a;i++)
		{   if(i==0)
			b[i]=sc.nextInt();
		else
		{	b[i]=sc.nextInt();
			c[j]=b[i-1]-b[i];
			if(c[j]<0)
				c[j]=(-c[j]);
			d[j]=c[j];
			j++;
		}
		}
		Arrays.sort(d);
		for(int i=0;i<a-1;i++)
		{       if(c[i]==d[a-2])
				{if(b[i+1]>=b[i])
					System.out.print(i+1);
				else
					System.out.print(i);
				}
		}
	}

}
