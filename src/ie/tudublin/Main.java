
package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("hello world");

        //Polymorphism: the type is a super class, the instance is a superclass

        //this is not a polymorphism
        Cat topcat = new Cat("Topcat");

        //this is polymorphism
        Animal mino = new Cat("Mino");

        //a vitual method
        //Dynamic binding
        mino.speak();

        //this will not compile
        //compiler only knows mino is an animal not a cat
        //System.out.println(mino.getNumLives());

        //this is an example of a cast
        System.out.println(((Cat)(mino)).getNumLives());

        //this will compile
        mino = new Dog("Misty");
        //this will not compile
        //topcat = new Dog("Tara");

        Animal a = new Cat("a");
        Animal b = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        a = b;
        a.setName("c");

        System.out.println(a);
        System.out.println(b);
    }
}

