package MakingCoffee;

import java.util.Scanner;

import static java.lang.Math.*;

public class CupOfCoffee {
    Scanner s = new Scanner(System.in);
    protected int water;
    protected int milk;
    protected int coffeeBeans;


    protected CupOfCoffee() {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }





    public void PrintResult(int numberOfCup, int howManyCups) {
        int result;
        if (numberOfCup > howManyCups) {
            result = numberOfCup - howManyCups;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)%n", result);
        } else if (howManyCups > numberOfCup) {
            System.out.printf("No, I can make only %d cup(s) of coffee%n", numberOfCup);
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}
