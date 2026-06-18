import java.util.*;
class Program6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int no=1;
			char ch='a';
			for(int j=1;j<=row+1-i;j++){
				if(j%2==0){
					System.out.print(ch+"\t");
					ch++;
				}else{
					System.out.print(no+"\t");
					no++;
				}
			}
			System.out.println();
		}
	}
}
