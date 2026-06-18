import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		int rem=0,rev=0,temp=no;
		while(no>0){
			rem=no%10;
			rev = rev*10+rem;
			no=no/10;
		}

		if(rev==temp){
			System.out.println("Number is Palindrome");
		}else{
			System.out.println("Number is Not Palindrome");
		}
	}
}
