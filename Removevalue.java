import java.util.Scanner;
public class Removevalue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=sc.nextInt();
        int count=0;
        for(int i=0;i<a;i++)
        {
        	b[i]=sc.nextInt();
        	if(c==b[i])
        	{
        		count++;
        	}
        }
        int d=a-count,j=0;
        int ad[]=new int[d];
        for(int i=0;i<a;i++)
        {
        	if(b[i]!=c)
        	{
        		ad[j]=b[i];
        		System.out.print(ad[j]+" ");
        		j++;
        	}
        }
	}

}
