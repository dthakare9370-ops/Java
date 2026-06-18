import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows : ");
		int row = sc.nextInt();

		int no = 1;
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				System.out.print(no+" ");
			}
			System.out.println();
			no++;
		}
	}
}
