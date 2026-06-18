import java.util.*;
class Range1to1000{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : - ");
		int no = sc.nextInt();

		if(no>0 && no<=1000){
		       System.out.println(no + " is in the Range1 to 1000");
		}else{
		       System.out.println(no + " is Not in the Range 1 to 1000");	
		}
	}
}	
