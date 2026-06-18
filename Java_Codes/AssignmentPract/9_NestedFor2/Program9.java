import java.util.*;
class Program9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();

		int no=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j%2==0){
					System.out.print(no+"\t");
				}else{
					System.out.print(no*no+"\t");
				}
				no++;
			}
			System.out.println();
		}
	}
}
