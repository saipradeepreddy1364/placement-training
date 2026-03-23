class Animal
{
    void eat()
    {
        System.out.println("Animal Is Eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark");
    }
}
public class Sinheritance
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}