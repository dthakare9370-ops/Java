import java.util.*;
class Program10{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row : ");
                int row = sc.nextInt();

		int no = 1;
                char ch = 'a';
			for(int i=1;i<=row;i++){
				no=i;
				for(int spc=1;spc<=row-i;spc++){
						System.out.print("\t");
				}
				for(int j=1;j<=i;j++){
					if(i!=2){
						System.out.print(no+""+(char)(ch-32)+"\t");
					}else{
						System.out.print(no+""+ch+"\t");
					}
					ch++;
				}
				System.out.println();
			}


        }
}
