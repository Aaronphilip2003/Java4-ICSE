import java.io.*;
class PALINDROME_PRINT
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";
        int len=s.length();
        String s1="",w="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(w.equals(s1))
                System.out.println(w);
                w="";
                s1="";
            }
            else
           {
            w=w+ch;
            s1=ch+s1;
        }
        }
        System.out.println(s1);
    }
}