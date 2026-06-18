import java.util.*;

class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int no = sc.nextInt();

        int num = no;
        int originalNum = no;  // Store the original number to compare for cycles
        boolean isTrue = true;

        // If the number is 1, it's a Happy Number
        if (num == 1) {
            System.out.println(no + " is a Happy Number ");
        } else {
            // Loop until num becomes 1 or we detect a cycle
            while (num != 1) {
                int sum = 0;
                // Calculate sum of squares of digits of num
                while (num > 0) {
                    int rem = num % 10;
                    sum = sum + rem * rem;
                    num = num / 10;
                }

                // If sum becomes 1, it's a Happy Number
                if (sum == 1) {
                    System.out.println(no + " is a Happy Number ");
                    isTrue = true;
                    break;
                } else {
                    num = sum;  // Update num with the sum of squares
                }

                // If the sum equals original number, a cycle is detected
                if (num == originalNum) {
                    isTrue = false;
                    break;
                }
            }
        }

        if (!isTrue) {
            System.out.println(no + " is a Sad Number ");
        }

        System.out.println();
    }
}

