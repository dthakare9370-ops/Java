import java.util.*;
class Program8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int no=row+1-i;
			for(int j=1;j<=row+1-i;j++){
				if(i%2==0){
					System.out.print((char)(64+no)+"\t");
				}else{
					System.out.print(no+"\t");
				}
				no--;
			}
			System.out.println();
		}
	}
}
