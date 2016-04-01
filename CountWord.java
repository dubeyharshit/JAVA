import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord
{    
    public static void main (String args[])
    {
       String  s = "ababccabcabcbcbc";
       int i = 0;
       Pattern p = Pattern.compile("bc");
       Matcher m = p.matcher(s);
       while(m.find())
       {
    	   i++;
       }
       System.out.println(i);
    }
}