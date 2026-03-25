//power of a number using function
/*import java.util.Scanner;
public class power 
{
    public void pow(double a,int b)
    {
        double result=Math.pow(a,b);
        System.out.println(a+" power of  "+b+" is "+result);
    } 
public static void main(String[] args)
{
    Scanner b=new Scanner(System.in);
    Double c=b.nextDouble();
    int d=b.nextInt();
    power p=new power();
    p.pow(c,d);
    b.close();
}
}*/
//power of a number using for loop
import java.util.Scanner;
public class power
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=1;
    for(int i=1;i<=b;i++)
        {
            result*=a;
        }
    System.out.println(a+" power "+b+" is: "+result);
    sc.close();
    }
    
}