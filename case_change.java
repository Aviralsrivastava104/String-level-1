import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(Character.isLowerCase(ch))
	        s=s.substring(0,i)+Character.toUpperCase(ch)+s.substring(i+1);
	        else
	        s=s.substring(0,i)+Character.toLowerCase(ch)+s.substring(i+1);
	        
	    }
	    System.out.println(s);
	}
}
