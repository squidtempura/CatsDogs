package ie.tudublin;

public class Dog extends Animal
{
    public Dog(String name)
    {
        //constructor chaining
        super(name);
    }

    public void speak()
    {
        System.out.println("woof");
    }
}