import java.util.*;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row : ");
		int row = sc.nextInt();
		
		int no = row*row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(no+"\t");
				no--;
			}
			System.out.println();	
		}	
	}
}
