import java.util.*;

class PrintNo0to5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int no = sc.nextInt();

        switch (no) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println(no +" is Greater than 5");
        }
    }
}

