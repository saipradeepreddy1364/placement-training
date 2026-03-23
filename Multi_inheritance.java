class Milk
{
    void coffee()
    {
        System.out.println("one should drink coffee");
    }
}
class Curd extends Milk
{
    void curd()
    {
        System.out.println("curd is thick in nature");
    }
}
class Lassi extends Curd{
    void lassi()
    {
        System.out.println("lassi is not thicker like curd");
    }
}
public class Multi_inheritance {
    public static void main(String[] args)
    {
        Lassi c=new Lassi();
        c.coffee();
        c.curd();
        c.lassi();

    }
}
