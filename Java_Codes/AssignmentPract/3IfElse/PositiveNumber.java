import java.util.*;
class PositiveNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int no = sc.nextInt();

		if(no<0){
			System.out.println(no+" is Negative");
		}else{
			System.out.println(no+" is Positive");
		}
	}

}
