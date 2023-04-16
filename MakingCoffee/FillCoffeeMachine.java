package MakingCoffee;

import java.util.Scanner;

import static java.lang.Math.min;

public class FillCoffeeMachine extends Coffee {

    Scanner s = new Scanner(System.in);
    int numWater;
    int numMilk;
    int numBeans;



    int numCost;
    int numOfCups;



    FillCoffeeMachine(int water, int milk, int beans, int cost) {
        super(water, milk, beans, cost);
    }
    FillCoffeeMachine(int numWater, int numMilk, int numBeans, int numCost, int numOfCups) {
        this.numWater = numWater;
        this.numMilk = numMilk;
        this.numBeans = numBeans;
        this.numCost = numCost;
        this.numOfCups = numOfCups;
    }

    public int setNumWater(int someWater) {
        numWater -= someWater;
        return this.numWater;
    }
    public int setNumMilk(int someMilk) {
        numMilk -= someMilk;
        return this.numMilk;
    }

    public int setNumBeans(int someBeans) {
        numBeans -= someBeans;
        return this.numBeans;
    }

    public int setNumOfCups() {
        numOfCups -= 1;
        return this.numOfCups;
    }

    public int getNumCost() {
        return this.numCost;
    }
    public int setCostToZero(int numCost) {
        return this.numCost = 0;
    }
    public int setCost(int someCost) {
        numCost += someCost;
        return this.numCost;
    }

    void printText() {

        System.out.printf("The coffee machine has:%n" +
                "%d ml of water%n" +
                "%d ml of milk%n" +
                "%d g of coffee beans%n" +
                "%d disposable cups%n" +
                "$%d of money%n%n", numWater, numMilk, numBeans, numOfCups, numCost);
    }
    void setMachine() {
        System.out.println("Write how many ml of water you want to add: ");
        int water = s.nextInt();
        numWater += water;

        System.out.println("Write how many ml of milk you want to add: ");
        int milk = s.nextInt();
        numMilk += milk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = s.nextInt();
        numBeans += beans;

        System.out.println("Write how many disposable cups you want to add:");
        int cups = s.nextInt();
        numOfCups += cups;
    }
    public boolean PrintResult(int water, int milk, int beans) {

        boolean waterTank = water < numWater;
        boolean milkTank = milk < numMilk;
        boolean beansTank = beans < numBeans;
        boolean cupsTank = numOfCups > 0;

        if (!waterTank && milkTank && beansTank && cupsTank) {
            System.out.printf("Sorry, not enough water!");
            System.out.println();
            return false;
        } else if (waterTank && !milkTank && beansTank && cupsTank) {
            System.out.printf("Sorry, not enough milk!");
            System.out.println();
            return false;
        } else if (waterTank && milkTank && !beansTank && cupsTank) {
            System.out.printf("Sorry, not enough coffee beans!");
            System.out.println();
            return false;
        } else if (waterTank && milkTank && beansTank && !cupsTank) {
            System.out.printf("Sorry, not enough disposable cups!");
            System.out.println();
            return false;
        } else if (waterTank && milkTank && beansTank && cupsTank) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            return true;
        } else {
            return false;
        }
    }
}
