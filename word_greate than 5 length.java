import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine().trim()+" ";
	    String s1="";
	  for(int i=0;i<s.length();i++)
	  {
	      char ch= s.charAt(i);
	  
	      if(ch==' ')
	      {
	          if(s1.length()>5)
	          System.out.println(s1);
	          s1="";
	      }
	      else{
	          s1=s1+ch;
	      }
	  }
	}
}
