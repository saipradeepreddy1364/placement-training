
class mark
{
    void two(int s1,int s2)
    {
        int to=s1+s2;
        System.out.println("the sum of marks for 2 subjects is: "+to);
    }
    void two(int s,int s2,int s3)
    {
        int three=s+s2+s3;
        System.out.println("the sum of three subject marks is: "+three);
    }
}
public class marks 
{
    public static void main(String[] args)
    {
        mark bye=new mark();
        bye.two(98,99);
        bye.two(100,99,98);
    }    
}
