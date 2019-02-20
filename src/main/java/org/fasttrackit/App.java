package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {




    Calculator c1 = new Calculator("Bacon Egg & Chees");
    Calculator c2 = new Calculator("Awesomeness");

        System.out.println(c1.getName() + " calculated " + c1.add(3,4) );
        System.out.println(c2.getName() + " calculated " + c2.divide(24,6));
        System.out.println(c1.getName() + " calculated " + c1.multiply(2,5));




    }
}
