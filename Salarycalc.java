class salary
{
    int s;
    void basic(int salary)
    {
        s=salary;
        System.out.println("the basic salary is: "+salary);
    }
    void bonus(double p)
    {
        double bonus=(s*p)/100;
        double total=s+bonus;
        System.out.println("the bonus amount is: "+bonus);
        System.out.println("the totaL amount is: "+total);
    }
}
public class Salarycalc 
{
    public static void main(String[] args)
    {
        salary b=new salary();
        b.basic(10000);
        b.bonus(69.69);
    }    
}
