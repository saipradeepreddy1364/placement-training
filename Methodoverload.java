class types
{
    void INT(int i)
    {
        System.out.println("the given data tyoe is int: "+i);
    }
    void INT(String a)
    {
        System.out.println("the given data type is a string: "+a);
    }
    void INT(Double d)
    {
        System.out.println("the given data type is Double: "+d);
    }
}
public class Methodoverload
{
    public static void main(String[] args)
    {
        types t=new types();
        t.INT(5);
        t.INT("Pradeep");
        t.INT(5.6989);
    }
}