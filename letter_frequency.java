import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    
	  for(char i ='a' ;i<='z';i++)
	  {
	      int f=0;
	      for(int j=0;j<s.length();j++)
	      {
	          if(s.charAt(j)==i)
	          f++;
	      }
	      if(f!=0)
	      System.out.println(i +" - "+f);
	  }
	}
}
