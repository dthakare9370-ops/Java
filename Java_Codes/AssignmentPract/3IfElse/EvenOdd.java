import java.util.*;
class EvenOdd{
	public static void main(String rgs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int no = sc.nextInt();

		if(no%2 == 0){
			System.out.println(no + " is Even");
		}else{
			System.out.println(no + " is Odd");
		}
	}
}
