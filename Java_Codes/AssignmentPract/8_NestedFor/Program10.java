import java.util.*;
class Program10{
	public static void main(String arhs[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=0;i<row;i++){
			char ch = 'A';
			for(int j=1;j<=row;j++){
				System.out.print(j+""+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
