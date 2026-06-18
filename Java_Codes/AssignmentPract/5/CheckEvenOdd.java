import java.util.*;
class CheckEvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number :- ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Second Number :- ");
                int no2 = sc.nextInt();

		if(no1<0 || no2<0){
			 System.out.println("Sorry, negative numbers are not allowed.");
		}else{
			int mul = no1*no2;
			switch(mul%2){
				case 0:
					System.out.println("Even Number");
					break;
				case 1:
					System.out.println("Odd Number");
                                        break;
			}
		}
	}
}
