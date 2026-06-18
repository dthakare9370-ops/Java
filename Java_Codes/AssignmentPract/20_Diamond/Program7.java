import java.util.*;
class Program7{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Row :");
                int row = sc.nextInt();
		
		int no=0,space=1,col=1;
		for(int i=1;i<=row*2-1;i++){
			if(i<=row){
				space=row-i;
				col = i*2-1;
				no=i;
			}else{
				space=i-row;
				col = col-2;
				no=no-2;
			}

			for(int spc=1;spc<=space;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=col;j++){
				if(j<=col/2){
					System.out.print(no+"\t");
					no--;
				}else{
					System.out.print(no+"\t");
					no++;
				}
			}
			System.out.println();
		}

	}
}

