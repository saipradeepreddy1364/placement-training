import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        int n;
        System.out.println("enter the number: ");
        n=a.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
    System.out.println("the factorial of "+n+" is "+fact);
    a.close();
    }    

}
