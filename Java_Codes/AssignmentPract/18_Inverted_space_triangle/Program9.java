import java.util.*;
class Program9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();

		int no=0;
		for(int i=1;i<=row;i++){
			no=row+1-i;
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=row+1-i;j++){
				System.out.print(no+"\t");
				no = no + row+1-i;
			}
			System.out.println();
		}
	}
}	
