import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		int no=(row)*(row+1)/2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row+1-i;j++){
				System.out.print((char)(64+no)+"\t");
				no--;
			}
			System.out.println();
		}
	}
}
