import java.util.*;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int row = sc.nextInt();

		int no=1;

		for(int i=1;i<=row;i++){
			no=row+1-i;
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){
				System.out.print(no+"\t");
			}
			System.out.println();
		}
	}
}
