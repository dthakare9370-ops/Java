import java.util.*;
class ArrayDemo1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row : ");
		int row = sc.nextInt();
		System.out.println("Enter col : ");
		int col = sc.nextInt();

		int a[][] = new int[row][col];

		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Elements Are : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
