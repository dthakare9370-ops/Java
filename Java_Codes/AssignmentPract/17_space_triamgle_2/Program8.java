import java.util.*;
class Program8{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row : ");
                int row = sc.nextInt();

		int no = row*(row+1)/2;
                char ch = (char)(96+no);
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				System.out.print(ch+"\t");
				ch--;
			}
			System.out.println();
		}


        }
}
