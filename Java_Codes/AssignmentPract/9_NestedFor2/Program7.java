import java.util.*;
class Program7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();

		int no;
		for(int i=1;i<=row;i++){
			no = row+1-i;
			for(int j=1;j<=row;j++){
				System.out.print(no+"\t");
				no = no+row;
			}
			System.out.println();
		}
	}
}
