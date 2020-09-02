import java.io.*;
import java.util.*;
public class pg4 
{
 public static void main(String[] args)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String str="";
     str=br.readLine();
     str=str+" ";
     int l=str.length();
     ArrayList<String> li =new ArrayList<String>();
     String st="";
     int i=0;
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
       
     int n;
     String s1=""; 
     String s2="";
     String s3="";
     for(i=0;i<li.size();i++)
     {
      st=li.get(i);
      l=st.length();
      n=(int)(l/3.0);
     if(l%3==1)
     {
  
        s1=s1+st.substring(0,n);
        s2=s2+st.substring(n,n+n+1);
        s3=s3+st.substring(n+n+1,l);
        
     }
     else if(l%3==2)
     {
         
        s1=s1+st.substring(0,n+1);
        s2=s2+st.substring(n+1,n+n+1);
        s3=s3+st.substring(n+n+1,l);
     }     
     else if(l%3==0)
     {
         
        s1=s1+st.substring(0,n);
        s2=s2+st.substring(n,n+n);
        s3=s3+st.substring(n+n,l);
     }
     }
     st="";
     char ch1;
     System.out.print(s1+" "+s2+" ");
     for(i=0;i<s3.length();i++)
     {
         char ch=s3.charAt(i);
         if((ch >='a') && (ch<='z'))
             ch1=Character.toUpperCase(s3.charAt(i));
         else
             ch1=Character.toLowerCase(s3.charAt(i));
         
         st=st+ch1;
     }
     System.out.print(st);
 }
}
