import java.util.*;
class Percentage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : - ");
		int marks = sc.nextInt();

		if(marks >=85){
			System.out.println("Medical");
		}else if(marks >= 75 && marks<=85){
			System.out.println("Engineering");
		}else if(marks>=65 && marks<=75){
			System.out.println("Pharmacy");
		}else{
			System.out.println("Home");
		}
	}
}
