import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    s=s.trim();
	    String result = s.charAt(0)+". ";
	    for(int i=1;i<s.length();i++)
	    {
	        if(s.charAt(i)==' ')
	        result = result+ (s.charAt(i+1)+". ");
	    }

	    System.out.println(s+ " - "+result);
	}
}
