import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    int l=0;
	    int u=s.length()-1;
	    int f=1;
	    while(l<u)
	    {
	        if(s.charAt(l)==s.charAt(u))
	        {
	            l++;
	            u--;
	        }
	        else
	        {
	            f=0;
	            break;
	        }
	    }
	    if(f==1)
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not Palindrome");
	}
}
