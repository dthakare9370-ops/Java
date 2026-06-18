import java.util.*;
class Program7{
	public static void main(String arge[]){
		int no=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Row : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			no=row+1-i;

			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){
				if(j<=(i*2-1)/2){
					System.out.print((char)(64+no)+"\t");
					no++;
				}else{
					System.out.print((char)(64+no)+"\t");
					no--;
				}
			}
			System.out.println();
		}
	}
}
