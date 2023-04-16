package MakingCoffee;

import java.util.Scanner;

import static java.lang.Math.min;

abstract class Coffee {
    Scanner s = new Scanner(System.in);

    public int water;
    public int milk;
    public int beans;
    public int cost;

    Coffee(){
        water = -1;
        milk = -1;
        beans = -1;
        cost = -1;
    }
    public Coffee(int water, int milk, int beans, int cost) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cost = cost;
    }


}
