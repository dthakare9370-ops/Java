import java.util.*;
class Program8{
	public static void main(String arge[]){
		int no=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Row : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			no=1;

			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){
				if(j<=(i*2-1)/2){
					System.out.print((no)+"\t");
					no=no+2;
				}else{
					System.out.print((no)+"\t");
					no=no-2;
				}
			}
			System.out.println();
		}
	}
}
