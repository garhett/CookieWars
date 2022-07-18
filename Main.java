/*
by PETE LARKIN

"
Remember these from back in the random email forwarding days? 😂 (#CookieWars edition)

1) Pick your favorite number between 1-9
2) Multiply by 3
3) Add 3
4) Multiply by 3 again (You'll get a 2 or 3 digit number)
5) Add the digits together

With that number, see who makes the best cookie from the list below:

1. Your mom
2. My mom
3. Crumbl
4. Twisted Sugar
5. Grandma’s (vending machine kind)
6. Crave
7. Walmart
8. Levi Lindsay 💭
9. Dirty Dough
10. Little Debbie
"

https://www.linkedin.com/posts/peteralarkin_cookiewars-activity-6954525462115057664---UJ?utm_source=linkedin_share&utm_medium=member_desktop_web
 */

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> numlist = new ArrayList<>();

        for (int i = 0; i < numArray.length; i++) {
            int tempNum = numArray[i];
            numArray[i] *= 3; // multiply by 3
            numArray[i] += 3; // add 3
            numArray[i] *= 3; // multiply by 3 again
            int sum = sumOfDigits(numArray[i]); // add the digits together
            int tempFinalNum = numArray[i];
            numlist.add(sum);

            System.out.println("Number " + tempNum + " equates to " + tempFinalNum
                    + ", which added together makes " + sum + ". This equals " + numToCookie(sum) + ".");
        }

        if (doesAllMatch(numlist)) {
            System.out.println("\nClick here: https://i.kym-cdn.com/entries/icons/facebook/000/000/157/itsatrap.jpg");
        }
    }

    static boolean doesAllMatch(ArrayList<Integer> ArrayList) {
        return ArrayList.stream()
                .distinct()
                .count() <= 1;
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }

    static String numToCookie(int num) {
        switch (num) {
            case 1:
                return "Your mom";
            case 2:
                return "My mom";
            case 3:
                return "Crumbl";
            case 4:
                return "Twisted Sugar";
            case 5:
                return "Grandma’s (vending machine kind)";
            case 6:
                return "Crave";
            case 7:
                return "Walmart";
            case 8:
                return "Levi Lindsay";
            case 9:
                return "Dirty Dough";
            case 10:
                return "Little Debbie";
            default:
                return "N/A";
        }
    }
}