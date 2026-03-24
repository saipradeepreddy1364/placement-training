import java.util.Scanner;
public class Reverseleet 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("The reversrd number is "+rev);
        sc.close();
    }
    
}
