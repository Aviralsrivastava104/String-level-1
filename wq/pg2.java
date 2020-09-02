import java.util.*;
import java.io.*;
public class pg2 {
     public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str=str+" ";
        String st="";
        int ch1,ch2;
        int l=str.length();
        int i=0;int sum=0;
        ArrayList<String> li=new ArrayList<String>();
        for(i=0;i<l;i++)
        {
            if(str.charAt(i)!=' ')
                st=st+str.charAt(i);
            else
            {
                li.add(st);
                sum=sum+st.length();
                st="";
            }
                
        }
        System.out.println(sum);
        int r=0,s=0;
        while(sum>=10)
        {
            while(sum>0)
            {
            r=sum%10;
            s=s+r;
            sum=sum/10;
            }
           sum=s; 
        }
        System.out.println(sum);
        
    }
    
}
