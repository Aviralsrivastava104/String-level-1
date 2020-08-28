import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    s=s.trim();
	    int result = 0;
	    for(int i=1;i<s.length();i++)
	    {
	        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	        result ++;
	    }

	    System.out.println(result);
	}
}