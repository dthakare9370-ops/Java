import java.util.*;
class Pythagorean{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :- ");
		int first = sc.nextInt();
		System.out.println("Enter Second number :- ");
                int second = sc.nextInt();
		System.out.println("Enter Third number :- ");
                int third = sc.nextInt();


		if((first*first)+(second*second) == (third*third)){
			System.out.println("It is Pythagorean Triplet");
		}else if((third*third)+(second*second) == (first*first)){
                        System.out.println("It is Pythagorean Triplet");
                }else if((third*third)+(first*first) == (second*second)){
                        System.out.println("It is Pythagorean Triplet");
                }else{
			System.out.println("It id Not Pythagorean triplet");
		}
	}
}
