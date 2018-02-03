package sda.design.patterns.ex2;

public class CatToDogAdapter extends Dog {
    private Cat cat;

    public CatToDogAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String woof() {
        return cat.meow();
    }
}
