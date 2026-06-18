import java.util.*;
class Program6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows : ");
		int row = sc.nextInt();

		char ch = (char)(64+row);
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("  ");
			}
			for(int j=1;j<=2*(row-i)+1;j++){
				System.out.print(ch+" ");
			}
			ch--;
			System.out.println();
		}
	}
}
