import java.util.*;
class DiagonalSum{
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
		
		int sum=0;

		System.out.println("Array Elements Are : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j){
					sum = sum +a[i][j];
				}else if(i+j == a.length-1){
					sum = sum + a[i][j];
				}
			}
		}

		System.out.println("Sum  = "+sum);
	}
}
