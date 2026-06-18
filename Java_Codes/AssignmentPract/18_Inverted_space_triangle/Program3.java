import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();

		
		char ch = 'a';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i>j){
					System.out.print("\t");
				}else{
					if(j%2==0){
						int no = (j/2);
						System.out.print(no+"\t");
						
					}else{
						System.out.print(ch+"\t");
						ch++;
					}
				}
			}
			System.out.println();
		}
	}
}
