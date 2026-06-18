import java.util.*;
class Program9{
	public static void main(String arhs[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=0;i<row;i++){
			char ch = 'A';
			for(int j=0;j<row;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
