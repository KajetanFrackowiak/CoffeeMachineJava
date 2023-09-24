package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfWater = 400;
        int amountOfMilk = 540;
        int weightOfBeans = 120;
        int disposableCups = 9;
        int amountOfMoney = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String actionChoose = scanner.nextLine();

            if (actionChoose.equals("buy")) {
                System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino," +
                        " back - to main menu:");

                String chooseOfCoffee = scanner.nextLine();
                if (chooseOfCoffee.equals("back")) {
                    continue;
                } else {
                    int chooseOfCoffeeInt = Integer.parseInt(chooseOfCoffee);
                    switch (chooseOfCoffeeInt) {
                        case 1:
                            if (amountOfWater - 250 >= 0 && weightOfBeans - 16 >= 0 && disposableCups - 1 >= 0) {
                                amountOfWater -= 250;
                                weightOfBeans -= 16;
                                amountOfMoney += 4;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (amountOfWater - 250 < 0) {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case 2:
                            if (amountOfWater - 350 >= 0 && amountOfMilk - 75 >= 0 && weightOfBeans - 20 >= 0 &&
                                    disposableCups - 1 >= 0) {
                                amountOfWater -= 350;
                                amountOfMilk -= 75;
                                weightOfBeans -= 20;
                                amountOfMoney += 7;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (amountOfWater - 250 < 0) {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case 3:
                            if (amountOfWater - 200 >= 0 && amountOfMilk - 100 >= 0 && weightOfBeans - 12 >= 0 &&
                                    disposableCups - 1 > 0) {
                                amountOfWater -= 200;
                                amountOfMilk -= 100;
                                weightOfBeans -= 12;
                                amountOfMoney += 6;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (amountOfWater - 200 < 0) {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                    }

                    System.out.println();
                }

            } else if (actionChoose.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int waterSupply = scanner.nextInt();
                amountOfWater += waterSupply;

                System.out.println("Write how many ml of milk you want to add:");
                int milkSupply = scanner.nextInt();
                amountOfMilk += milkSupply;

                System.out.println("Write how many grams of coffee beans you want to add:");
                int coffeeSupply = scanner.nextInt();
                weightOfBeans += coffeeSupply;

                System.out.println("Write how many disposable cups you want to add:");
                int cupsSupply = scanner.nextInt();
                disposableCups += cupsSupply;

            } else if (actionChoose.equals("take")) {

                System.out.printf("I gave you $%d\n\n", amountOfMoney);
                amountOfMoney = 0;

            } else if (actionChoose.equals("remaining")) {
                System.out.println();
                coffeeMachine(amountOfWater, amountOfMilk, weightOfBeans, disposableCups, amountOfMoney);
                System.out.println();
            } else if (actionChoose.equals("exit")) {
                break;
            }
        }

    }

    public static void coffeeMachine(int amountOfWater, int amountOfMilk, int weightOfBeans, int disposableCups,
                                     int amountOfMoney) {


        System.out.printf("""
                        The coffee machine has:
                        %d ml of water
                        %d ml of milk
                        %d g of coffee beans
                        %d disposable cups
                        $%d of money
                        """, amountOfWater, amountOfMilk, weightOfBeans, disposableCups,
                amountOfMoney);
    }
}
