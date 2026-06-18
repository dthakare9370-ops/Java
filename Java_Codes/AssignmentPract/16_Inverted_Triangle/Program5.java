import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		int no=0;
		for(int i=1;i<=row;i++){
			no=1;
			for(int j=1;j<=row+1-i;j++){
				if(i%2==0){
					System.out.print((char)(96+no)+"\t");
				}else{
					System.out.print((char)(64+no)+"\t");
				}
				no++;
			}
			System.out.println();
		}
	}
}
