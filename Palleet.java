import java.util.Scanner;
public class Palleet 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pal=0;
        int original=n;
        while(n>0)
        {
            int digit=n%10;
            pal=pal*10+digit;
            n/=10;
        }
        if(pal==original)
        {
            System.out.println("the number is a palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }
        sc.close();
    }

}
