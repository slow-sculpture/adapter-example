package sda.design.patterns.ex2;

public class Dog {
    private static int index = 1;
    private int dogNo;

    public Dog() {
        dogNo = index;
        index++;
    }

    public String woof() {
        return "Pies nr " + dogNo +": Hau! Hau!";
    }
}
