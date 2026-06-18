import java.util.*;
class NoInTable13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int no = sc.nextInt();

		if(no%13==0){
			System.out.println(no + " is in the Table 13");
		}else{
			System.out.println(no + " is not in the Table 13");
		}
	}
}
