import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row :");
		int row = sc.nextInt();

		int no=0,space=1,value=1;
		for(int i=1;i<=row*2-1;i++){
			no=1;
			if(i<=row){
				space = row-i;
				value = i*2-1;
			}else{
				space = i-row;
				value = value-2;
			}

			for(int spc=1;spc<=space;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=value;j++){
				System.out.print(no+"\t");
				no++;
			}
			System.out.println();
		}
	}
}

