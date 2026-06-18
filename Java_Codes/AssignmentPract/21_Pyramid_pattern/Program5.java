import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int row = sc.nextInt();

		int no=1;

		for(int i=1;i<=row;i++){
			no=i;
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				if(i%2==0){
					System.out.print((char)(64+no)+"\t");
                                }else{
				  	System.out.print(no+"\t");
 				}
			}
			System.out.println();
		}
	}
}
