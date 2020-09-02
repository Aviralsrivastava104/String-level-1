import java.util.*;
import java.io.*;

public class pg3 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int ind=s.indexOf('_');
        String s1="",s2="";
        s1=s.substring(0,ind);
        s2=s.substring(ind+1);
        String str=br.readLine();
        str=str+":";
        String st1="";
        String st2="";
        String st="";
        String fstr="";
        int l=str.length();
        int i=0;
        ArrayList<String> li=new ArrayList<String>();
        for(i=0;i<l;i++)
        {
            if(str.charAt(i)!=':')
                st=st+str.charAt(i);
            else
            {
                st1=st.substring(0,ind);
                st2=st.substring(ind+1);
                if(st1.equalsIgnoreCase(s1)==true && st2.equalsIgnoreCase(s2)==true)
                fstr=fstr+st+":";    
                st="";
            }
                
        }
        st=fstr.substring(0,fstr.length()-1);
        String myname= st.toUpperCase();
        if(myname.length()!=0)
        System.out.println(myname);
        else
           System.out.println("EROR-0909");  
    }
}
