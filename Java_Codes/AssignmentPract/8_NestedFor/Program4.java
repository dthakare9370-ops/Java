import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Rows : ");
		int row = sc.nextInt();

		int no = 1;

		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}

	}
}
