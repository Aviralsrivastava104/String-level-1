import java.util.*;
import java.io.*;
public class pg1 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str=str+" ";
        String st="";
        int ch1,ch2;
        int l=str.length();
        int i=0;
        ArrayList<String> li=new ArrayList<String>();
        for(i=0;i<l;i++)
        {
            if(str.charAt(i)!=' ')
                st=st+str.charAt(i);
            else
            {
                li.add(st);
                st="";
            }
                
        }
       
        int j=0;int dif=0;int sum=0;
        String s="";int k=0;
        for(i=0;i<li.size();i++)
        {
            st=li.get(i);
            
            k=st.length();
            dif=0;sum=0;
            for(j=0;j<(k/2);j++)
            {
               ch1=Math.abs((int)st.charAt(j)-64);
               ch2=Math.abs((int)st.charAt(k-1-j)-64);
                 
               dif=Math.abs(ch1-ch2);
               sum=sum+dif;
            }
            if(k%2!=0)
            sum=sum+((int)st.charAt(j)-64);
            s=s+sum;
        }
        System.out.println(s);
    }
    
}
