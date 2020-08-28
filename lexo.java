import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    
	    String s2 = sc.nextLine();
	    
	    int l=0;int f=0;
	    int l1=0;
	    while(l<s.length() && l1<s2.length())
	   {
	        if(s.charAt(l)<s2.charAt(l1))
	        {
	            f=0;
	            break;
	        }
	        else if(s.charAt(l)>s2.charAt(l1))
	        {
	            f=1;
	            break;
	        }
	        else if(l ==s.length()-1 || l1 == s2.length())
	        {
	            f=3;
	            break;
	        }
	        l++;
	        l1++;
	    }
	    
	    if(f==0)
	    System.out.println(s + " "+s2);
	    else if(f==1)
	    System.out.println(s2+" "+s);
	    else
	    System.out.println("equal");
	}
}
