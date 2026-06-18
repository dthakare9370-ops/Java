import java.util.*;
class AssignmentOP{
	public static void main(String arhs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :- ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int b = sc.nextInt();

		System.out.println("+=  :- "+(a+=3));
		System.out.println("-=  :- "+(b-=2));
		System.out.println("*=  :- "+(a*=2));
		System.out.println("/=  :- "+(b/=3));
		System.out.println("%=  :- "+(a%=5));
	}
}

