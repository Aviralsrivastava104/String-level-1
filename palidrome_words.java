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
	          StringBuffer s2 = new StringBuffer(s1);
	          String s3 = s2.reverse().toString();
	           if(s1.equals(s3))
	          System.out.println(s1);
	          s1="";
	      }
	      else{
	          s1=s1+ch;
	      }
	  }
	}
}
