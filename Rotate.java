import java.util.Scanner;
public class Rotate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int a=sc.nextInt();
		int b[]=new int[a];
		
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<c;i++)
		{  int k=0,j=0;
			int temp=b[k];
			for(j=k+1;j<a;j++)
			{
			b[k]=b[j];
			k++;
		    }
		b[k]=temp;
		
		}
	for(int i=0;i<a;i++)		
System.out.print(b[i]);
	}

}
