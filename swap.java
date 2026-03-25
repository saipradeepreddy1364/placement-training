import java.util.Scanner;
public class swap 
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    /*if(a>0&&b>0)
    {
        a=b+a;
        b=a-b;
        a=a-b;
    }*/
    a=(a+b)-(b=a);
    System.out.println(a);
    System.out.println(b);
    sc.close();
}
}