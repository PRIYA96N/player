import java.util.*;
 
public class Singleint
{
 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y[] = new int[x];
        for(int i=0;i<x;i++)
        {
            y[i]=sc.nextInt();
        }
        Arrays.sort(y);
    for(int i=0;i<x;i++)
    {
        if(y[i]!=y[i+1])
        {
            System.out.print(y[i]);
        }
    }
        		
    }
}
