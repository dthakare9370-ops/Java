import java.util.*;
class Program2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int row = sc.nextInt();

		int no=1;
		for(int i=1;i<=row;i++){
			no=i;
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=row+1-i;j++){
				if(no%2==0){
					System.out.print((char)(64+no)+"\t");
				}else{
					System.out.print(no+"\t");	
				}
				no++;			
			}
			System.out.println();
		}
	}
}
