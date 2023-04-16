package MakingCoffee;

public class Cappuccino extends Coffee{
    protected static final int WATER = 200;
    protected static final int MILK = 100;
    protected static final int BEANS = 12;
    static final int COST = 6;

    Cappuccino() {
        super(WATER, MILK, BEANS, COST);
    }

}
