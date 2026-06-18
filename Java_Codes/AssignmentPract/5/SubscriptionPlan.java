import java.util.*;

class SubscriptionPlan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

	System.out.println("**** Subscription Plans ****");
        System.out.println("1. Platinum Plan - 799");
        System.out.println("2. Gold Plan - 599");
        System.out.println("3. Silver Plan - 399");
        System.out.println("4. Bronze Plan - 199");
        System.out.println("5. Less than 199 - Free with limited access");
        System.out.print("Enter your budget for the subscription: ");
        int price = sc.nextInt();

        switch (price) {
            case 799:
                System.out.println("You can buy the Platinum plan.");
                break;
            case 599:
                System.out.println("You can buy the Gold plan.");
                break;
            case 399:
                System.out.println("You can buy the Silver plan.");
                break;
            case 199:
                System.out.println("You can buy the Bronze plan.");
                break;
            default:
                if (price < 199) {
                    System.out.println("The platform is free with limited access.");
                } else {
                    System.out.println("Please enter a valid subscription price !!");
                }
        }
    }
}

