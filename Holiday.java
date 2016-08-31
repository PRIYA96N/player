import java.util.*;
public class Holiday{
    public static boolean holi(String s2)
    {
        String a="Monday";
        String b="Tuesday";
        String c="Wednesday";String d="Thursday";String e="Friday";String f="Saturday";
        if((s2.equalsIgnoreCase(a))||(s2.equalsIgnoreCase(b))||(s2.equalsIgnoreCase(c))||(s2.equalsIgnoreCase(d))||(s2.equalsIgnoreCase(e))||(s2.equalsIgnoreCase(f)))
        return true;
    else
    return false;
    }
     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      Holiday hh=new Holiday();
      System.out.print(hh.holi(s1));
     }
}
