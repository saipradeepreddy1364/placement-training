class example
{
    void print(int a, String s)
    {
        System.out.println("the functon takes: "+a+" and "+s);
    }
    void print(String a, int s)
    {
        System.out.println("the functon takes: "+a+" and "+s);
    }
}
public class overload 
{
    public static void main(String[] args)
    {
         example tata=new example();
         tata.print(5,"pradeep");
         tata.print("pradeep",5);
    }    
}
