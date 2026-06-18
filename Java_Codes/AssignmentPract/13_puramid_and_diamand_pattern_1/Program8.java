import java.util.*;
class Program8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();

		int no = 1;
		int space=1,value=1;
		for(int i=1;i<=2*row-1;i++){
			if(i<=row){
				space = row-i;
				value = 2*i-1;
			}else{
				space = i-row;
				value = 2*(2*row-i)-1;
				//value = value-2;
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
