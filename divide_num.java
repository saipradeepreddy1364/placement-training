import java.util.Scanner;
public class divide_num 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result;
        result=n1/n2;
        System.out.println("Result is: "+Math.abs(result));
        sc.close();
    }    
}
