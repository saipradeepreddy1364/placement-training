import java.util.Scanner;
public class pat 
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        int n;
        System.out.println("Enter no of rows: ");
        n=a.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        a.close();
    }    
}
