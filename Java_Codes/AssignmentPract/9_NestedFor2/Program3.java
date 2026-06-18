import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows :");
		int row = sc.nextInt();

		int no;
		for(int i=1;i<=row;i++){
			no=i;
			for(int j=1;j<=row;j++){
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}
}
