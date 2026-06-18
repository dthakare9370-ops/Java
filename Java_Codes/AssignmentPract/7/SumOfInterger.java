import java.util.*;
class SumOfInteger{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter From :- ");
                int from = sc.nextInt();
                System.out.println("Enter To :- ");
                int to = sc.nextInt();

		int sum = 0;
                while(from<=to){
                        sum = sum + from;
                        from++;
                }
                System.out.println("Sum = "+sum);
        }
}
