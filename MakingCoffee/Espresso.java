package MakingCoffee;

public class Espresso extends Coffee {
    protected static final int WATER = 250;
    protected static final int MILK = 0;
    protected static final int BEANS = 16;
    static final int COST = 4;

    Espresso() {
        super(WATER, MILK, BEANS, COST);
    }



//    public void minusEspresso(int numWater, int numBeans, int numCost, int numOfCups) {
//        numWater = numWater - WATER;
//        numBeans = numBeans - BEANS;
//        numCost = numCost + COST;
//        numOfCups -= 1;
//
//        System.out.printf("The coffee machine has:%n" +
//                "%d ml of water%n" +
//                "%d g of coffee beans%n" +
//                "%d disposable cups%n" +
//                "$%d of money%n", numWater, numBeans, numOfCups, numCost);
//    }
}
