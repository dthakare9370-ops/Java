import java.util.*;
class Program7{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row : ");
                int row = sc.nextInt();

		int num=64;
                int no = 1;
		for(int i=1;i<=row;i++){
			num=i/2;
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print((char)(64+num)+"\t");
				}else{
					System.out.print(no+"\t");
				}
				no++;
			}
			System.out.println();
			
		}


        }
}
