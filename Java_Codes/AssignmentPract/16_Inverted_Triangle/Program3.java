import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		int no=(row*row)+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row+1-i;j++){
				System.out.print(no+"\t");
				no=no-2;
			}
			System.out.println();
		}
	}
}
