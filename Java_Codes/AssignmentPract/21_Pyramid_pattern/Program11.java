import java.util.*;
class Program11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int row = sc.nextInt();

		int no1=0;
		int no2=1;
		int nextNum=0;
		
		for(int i=1;i<=row;i++){

			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}
	
			for(int j=1;j<=i*2-1;j++){
				
				System.out.print(no1+"\t");
				nextNum = no1 + no2;
				no1 = no2;
				no2 = nextNum;				
								
			}
			System.out.println();
		}
	}
}



