//Abundent Number 
import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Number :");
		int start = sc.nextInt();
		System.out.println("Enter the End Number : ");
		int end = sc.nextInt();

		for(int no=start;no<=end;no++){
			int x=1;
			int sum=0;

			while(x<no){
				if(no%x==0){
					sum = sum+x;
				}
				x++;
			}

			if(sum>no){
				System.out.print(no+"\t");
			}
		}
		System.out.println();
	}
}
