import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();

		int no = 0;
		int first = ((row+1)*(row+1)/2);
		if(row%2==0){
			no = first*(row+1);
		}else{
			no = first*row;
		}

		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=row+1-i;j++){
				System.out.print(no+"\t");
				no = no - row;
			}
			System.out.println();
		}
		
	}
}	
