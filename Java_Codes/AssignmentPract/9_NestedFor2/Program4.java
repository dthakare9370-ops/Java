import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Row :");
		int row = sc.nextInt();
		int data = row+64;
		char ch = (char)data;
		
		int no=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(ch+""+no+"\t");
				no++;
			}
			System.out.println();
		}
	}
}
