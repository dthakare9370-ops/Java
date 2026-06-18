import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int row = sc.nextInt();
		
		int no=0;
		for(int i=1;i<=row;i++){
			no=row;
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					System.out.print((char)(96+no)+"\t");
				}else{
					System.out.print(no+"\t");
				}
				no++;
			}
	 		System.out.println();
		}
			
	}
}
