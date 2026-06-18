import java.util.*;
class SumOfOddNumbers{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter From :- ");
                int from = sc.nextInt();
                System.out.println("Enter To :- ");
                int to = sc.nextInt();

                int sum = 0;
                while(from<=to){
			if(from%2==1){
				sum = sum + from;
			}
                        from++;
                }
                System.out.println("Sum = "+sum);
        }
}
