import java.util.*;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : - ");
		int no = sc.nextInt();
		int temp=no,rev=0,rem=0;
		int i=1;

		System.out.print("Factor of "+no+" are : ");
		while(i<=no){
			if(no%i==0){
				System.out.print(i+" ,");
			}
			i++;
		}
		System.out.println();
	}
}
