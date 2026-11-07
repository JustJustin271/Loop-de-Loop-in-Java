// Created: Saturday, November 7th, 2026
// Last Edited: Saturday, November 7th, 2026

// Created to learn about various loopings in Java :)

class Main {
    public static void main(String[] args) {

        int n = 9;
        int total = 0;

        for (int count = 1; count <= n ;count += 2) {
            total += count;
        }

        System.out.println(total);


        int countDown = 10;

        while (countDown > 0) {
            System.out.println(countDown);
            countDown--;
        }

        System.out.println("Lift Off!");

        

        int row = 3;
        int column = 3;

        while (row > 0) {
            for (int eachChar = 0; eachChar < column; eachChar++) {
                System.out.print("*");
            }
            System.out.println("");

            row--;
        }

        


        int triangleSize = 5;

        for (int triangleRow = 1; triangleRow <= triangleSize; triangleRow++) {
            for (int star = 1; star <= triangleRow; star++) {
                System.out.print("*");
            }

            System.out.println("");
        }


        for (int count = 1; count <= 20; count++) {
            if (count % 5 == 0) {
                continue;
            } else if (count % 2 == 0) {
                System.out.println(count * 2);
            } else {
                System.out.println(count);
            }
        }


        int number = 1234;
        int sum = 0;

        while(number > 0) {
            sum += (number % 10);

            number = number / 10;
        }

        System.out.println(sum);

        

        int[] prices = {5, 12, 3, 8};

        int total3 = 0;

        for(int itemIndex = 0; itemIndex < prices.length; itemIndex++) {
            total3 += prices[itemIndex];
        }

        System.out.println(total3);

        

        int[] prices2 = {5, 12, 3, 8};

        int total2 = 0;

        for(int itemPrice: prices2) {
            total2 += itemPrice;
        }

        System.out.println(total2);

        String[] items = {"Apple", "Banana", "Cookie", "Dough", "Eggs"};
        int[] prices3 = {1, 2, 3, 4, 5};

        int subtotal = 0;
        double salesTax = 1.06;

        System.out.println("Generic Grocery List");

        for (int groceryIndex = 0; groceryIndex < items.length; groceryIndex++){
            System.out.println(items[groceryIndex] + ": $" + prices3[groceryIndex]);
        }

        for (int itemPrice: prices3) {
            subtotal += itemPrice;
        }

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total: $" + subtotal * salesTax);

        
    }
}
