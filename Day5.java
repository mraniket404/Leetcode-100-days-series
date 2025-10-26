//  🚀 Day 5 There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

// The operation of drinking a full water bottle turns it into an empty bottle.

// Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

 

import java.util.*;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Input section
        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter exchange rate (empty bottles for 1 full): ");
        int numExchange = sc.nextInt();

     
        Solution sol = new Solution();
        int result = sol.numWaterBottles(numBottles, numExchange);

        System.out.println("Maximum bottles you can drink: " + result);

        sc.close();
    }
}

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            int changed = numBottles / numExchange;  
            int rem = numBottles % numExchange;      
            ans += changed;                         
            numBottles = changed + rem;              
        }

        return ans;
    }
}
