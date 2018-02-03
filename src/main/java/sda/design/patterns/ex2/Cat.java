package sda.design.patterns.ex2;

public class Cat {
    private static int index = 1;
    private int catNo;

    public Cat() {
        catNo = index;
        index++;
    }

    public String meow() {
        return "Kot nr " + catNo + " : Miau! Miau!";
    }
}
