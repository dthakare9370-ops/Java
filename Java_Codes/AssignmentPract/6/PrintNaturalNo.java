import java.util.*;
class PrintNaturalNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int no = sc.nextInt();

		for(int i=1;i<=no;i++){
			System.out.print(" "+i);
		}
	}
}
