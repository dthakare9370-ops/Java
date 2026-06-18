import java.util.*;
class Program8{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row : ");
                int row = sc.nextInt();

		int no=0;
		if(row%2==0){
			no=row*(row+1)/2;
		}else{
			no=(row+1)*(row+1)/2;
		}

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i>j){
					System.out.print("\t");
				}else{
					if(j%2==1){
						System.out.print(no*no+"\t");
					}else{
						System.out.print(no+"\t");
					}
					no--;
				}
			}
			System.out.println();
		}
        }
}  
