import java.util.*;
class Program7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int no=row+1-i;
			for(int j=1;j<=row+1-i;j++){
				if(j%2==0){
					System.out.print((char)(96+no)+"\t");
				}else{
					System.out.print(no+"\t");
				}
				no--;
			}
			System.out.println();
		}
	}
}
