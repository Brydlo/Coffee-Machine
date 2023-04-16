package MakingCoffee;

public class Latte extends Coffee{
    protected static final int WATER = 350;
    protected static final int MILK = 75;
    protected static final int BEANS = 20;
    static final int COST = 7;

    Latte() {
        super(WATER, MILK, BEANS, COST);
    }

}
