import java.util.*;

class Demo{
	static void UserInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payer Name : ");
		String pName = sc.next();

		System.out.println("Enter the jerNo : ");
		int jerNo = sc.nextInt();

		System.out.println("Enter Index : ");
		int index = -1;

		try{
			index = sc.nextInt();

		}catch(InputMismatchException e){
			System.out.println("Plase Enter the Correct Index : ");
			sc.next();
			index = sc.nextInt();
		}

		try{
			System.out.println(pName.charAt(index));
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("handling code 1");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Handling code 2");
		}
			
	}
	public static void main(String args[]){
		System.out.println("Start Main");
		UserInput();
		System.out.println("End Main");
	}
}

