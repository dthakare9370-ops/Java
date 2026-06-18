import java.util.*;
class Program3{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row : ");
                int row = sc.nextInt();

                int no = 1;
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(no%2==1){
					System.out.print(no*no+"\t");
				}else{
					System.out.print(no+"\t");
				}
				no++;
			}
			System.out.println();
		}

        }
}
