import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    ArrayList<String> days = new ArrayList<String>();
	    days.add("monday");
	    days.add("tuesday");
	    days.add("wednesday");
	    days.add("thursday");
	    days.add("friday");
	    days.add("saturday");
	    days.add("sunday");
	    s=s.toLowerCase();
	    s=s.trim();
	    System.out.println(days.indexOf(s)+1);
	}
}
