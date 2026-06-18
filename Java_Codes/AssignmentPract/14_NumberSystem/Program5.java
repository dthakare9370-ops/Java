import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		int rem=0;
		while(no>0){
			rem = no%10;
			System.out.print(rem+" ,");
			no=no/10;
		}
	}
}
