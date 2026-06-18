import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			int no = 1;
			
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=row+1-i;j++){
				if(i%2==1){
					System.out.print(no+"\t");
				}else{
					System.out.print((char)+(64+no)+"\t");
				}
				no++;
			}
			System.out.println();
		}
	}
}
