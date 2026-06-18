import java.util.*;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int row = sc.nextInt();

		char ch = 'a';
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=row+1-i;j++){
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}
}
