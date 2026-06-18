import java.util.*;
class SocietyDeata{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Society Name : ");
		String sName = sc.nextLine();

		System.out.println("Enter Wing Name : ");
		char wing = sc.next().charAt(0);

		System.out.println("Enter Flat Number : ");
		int flatNo = sc.nextInt();

		System.out.println("Enter Rent : ");
		float rent = sc.nextFloat();

		System.out.println("**** Society Details *****");
		System.out.println("Society Name :- "+sName);
		System.out.println("Wing :- "+wing);
		System.out.println("Flat No :- "+flatNo);
		System.out.println("Rent :- "+rent);
	}
}
