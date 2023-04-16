package MakingCoffee;

import java.util.Scanner;


public class MakingCoffee {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Espresso es = new Espresso();
        Latte latte = new Latte();
        Cappuccino cap = new Cappuccino();
//        CupOfCoffee cOc = new CupOfCoffee();

        int numWater = 400;
        int numMilk = 540;
        int numBeans = 120;
        int numCost = 550;
        int numOfCups = 9;

        FillCoffeeMachine fill = new FillCoffeeMachine(numWater, numMilk, numBeans, numCost, numOfCups);


        String decision = "";
        while (!decision.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            decision = s.nextLine();
            switch (decision) {
                case "buy":
                    System.out.println("1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String decWhatKindOfCoffee = s.nextLine();
                    switch (decWhatKindOfCoffee) {
                        case "1" -> {
                            if (!fill.PrintResult(es.WATER, es.MILK, es.BEANS)) {
                                continue;
                            }
                            fill.setNumWater(es.WATER);
                            fill.setNumMilk(es.MILK);
                            fill.setNumBeans(es.BEANS);
                            fill.setNumOfCups();
                            fill.setCost(es.COST);
                        }
                        case "2" -> {
                            if (!fill.PrintResult(latte.WATER, latte.MILK, latte.BEANS)) {
                                continue;
                            }
                            fill.setNumWater(latte.WATER);
                            fill.setNumMilk(latte.MILK);
                            fill.setNumBeans(latte.BEANS);
                            fill.setNumOfCups();
                            fill.setCost(latte.COST);
                        }
                        case "3" -> {
                            if (!fill.PrintResult(cap.WATER, cap.MILK, cap.BEANS)) {
                                continue;
                            }
                            fill.setNumWater(cap.WATER);
                            fill.setNumMilk(cap.MILK);
                            fill.setNumBeans(cap.BEANS);
                            fill.setNumOfCups();
                            fill.setCost(cap.COST);
                        }
                        case "back" -> {
                            continue;
                        }
                        default -> System.out.println("Wrong input!");
                    }
                    break;
                case "fill":
                    fill.setMachine();
                    break;
                case "take":
                    System.out.printf("I gave you %d%n", fill.getNumCost());
                    fill.setCostToZero(numCost);
                    break;
                case "remaining":
                    fill.printText();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}