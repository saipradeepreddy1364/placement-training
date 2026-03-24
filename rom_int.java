import java.util.Scanner;
public class rom_int 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int result=0;
        for(int i=0;i<a.length();i++)
        {
            int val1=value(a.charAt(i));
            if(i+1<a.length())
            {
                int val2=value(a.charAt(i+1));
                if(val1<val2)
                {
                    result=result+(val2-val1);
                    i++;
                }
                else{
                    result=result+val1;
                }
            }
            else
            {
                result=result+val1;
            }
        }System.out.println("Integer value: "+result);
        sc.close();
        }
        public static int value(char r)
        {
            if(r=='I') return 1;
            if(r=='V') return 5;
            if(r=='X') return 10;
            if(r=='L') return 50;
            if(r=='C') return 100;
            if(r=='D') return 500;
            if(r=='M') return 1000;
            return 0;    
        }
}
