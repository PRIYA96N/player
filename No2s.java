import java.util.*;
public class No2s {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		String b[]=new String[a+1];
		for(int i=0;i<a+1;i++)
		{
			b[i]=""+i;
			int c=b[i].length();
			char e[]=b[i].toCharArray();
			for(int j=0;j<c;j++)
			{   int f=Character.getNumericValue(e[j]);
				if(f==2)
				{
					count++;
				}
			}
		}
       System.out.println(count);
	}

}
