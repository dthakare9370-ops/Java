import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int row = sc.nextInt();

		int no=1;

		for(int i=1;i<=row;i++){
			no=row;
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){
				if(j<=(i*2-1)/2){
					System.out.print(no+"\t");
					no--;
				}else{
					System.out.print(no+"\t");
					no++;
				}
			}
			System.out.println();
		}
	}
}
