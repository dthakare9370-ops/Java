import java.util.*;
class DivisibleBy5{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter From :- ");
                int from = sc.nextInt();
		System.out.println("Enter To :- ");
                int to = sc.nextInt();
               
               
                while(from<=to){
			if(from%5==0){
                        	System.out.print(from+" ");
			}
                        from++;
                }
                System.out.println();
        }
}
